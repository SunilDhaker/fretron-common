package com.fretron.utils.ClusteringUtils;

import static com.fretron.utils.helper.DistanceCalculator.distance;

import com.fretron.Model.LitePosition;
import com.fretron.Model.TimeAwarePolyline;
import com.fretron.utils.PolylineUtils.PolylineDecoder;
import java.util.List;

/**
 * Created by sdhaker on 21/07/17.
 */
public class ClusteringUtils {

    private static PolylineDecoder decoder = PolylineDecoder.getInstance();

    public static class MeanVariance{
        public LitePosition mean ;
        public double variance ;

        public MeanVariance(LitePosition mean , double variance){
            this.mean = mean;
            this.variance = variance;

        }
    }


    public static LitePosition calculateMean(List<LitePosition> positions){
        LitePosition meanPosition = new LitePosition(0d,0d,0d,0d,"",0l,"" , null , null,null ,false ,null);
		if(positions.size() > 0){
			for (LitePosition p : positions) {
				meanPosition.latitude = meanPosition.latitude +p.latitude;
				meanPosition.longitude = meanPosition.longitude +p.longitude;
				meanPosition.time = meanPosition.time + p.getTime();
			}
			meanPosition.latitude = meanPosition.latitude / positions.size() ;
			meanPosition.longitude = meanPosition.longitude / positions.size() ;
			meanPosition.time = meanPosition.time / positions.size();
		}
		return meanPosition;
	}

    public static double calculateVariance(List<LitePosition> positions){
        double variance = 0 ;
		LitePosition meanPosition  = calculateMean(positions);
		return calculateVariance(positions,meanPosition);
	}

	public static double calculateVariance(List<LitePosition> positions , LitePosition mean){

		double variance = 0 ;
		if(positions.size() > 1){
			for (LitePosition p : positions) {
				double distanceFromMean = distance(p , mean);
				variance = variance + (distanceFromMean * distanceFromMean);
			}
		}
		return variance;
	}



	public static MeanVariance forTimeAwarePolyline(TimeAwarePolyline polyline){
		List<LitePosition> points = decoder.decodeTimeAwarePolylineInPositions(polyline.getPolyline());
		LitePosition meanPosition = calculateMean(points);
		double variance = calculateVariance(points, meanPosition);
		return (new MeanVariance(meanPosition , variance));
	}


	public static MeanVariance forPolyline(String encodedPolyline){
	    List<LitePosition> points = decoder.decodeInPositions(encodedPolyline);
		LitePosition meanPosition = calculateMean(points);
		double varience = calculateVariance(points, meanPosition);
		return (new MeanVariance(meanPosition , varience));
	}

	public static MeanVariance merge(LitePosition mean1 , double variance1 , int n1 , LitePosition mean2 , double variance2 , int n2)
	{ LitePosition newMean =new LitePosition(0d,0d,0d,0d,"",0l,"" , null , null,null ,false ,null);
		newMean.latitude = (n1 * mean1.latitude + n2 * mean2.latitude) / (n1 + n2);
		newMean.longitude = (n1 * mean1.longitude + n2 * mean2.longitude) / (n1 + n2);
		double d1 = distance(mean1 , newMean);
		double d2 = distance(mean2 , newMean);
		double newVariance = ((n1 * ( variance1 + (d1*d1))) + (n2 * ( variance2 + (d2*d2))))/(n1 + n2) ;
		return new MeanVariance(newMean , newVariance);
	}



	//course == heading == altitude
	public static double getHeading(double lat1, double lon1, double lat2, double lon2){
        double longitude1 = lon1;
		double longitude2 = lon2;
		double latitude1 = Math.toRadians(lat1);
		double latitude2 = Math.toRadians(lat2);
		double longDiff= Math.toRadians(longitude2-longitude1);
		double y= Math.sin(longDiff)*Math.cos(latitude2);
		double x=Math.cos(latitude1)*Math.sin(latitude2)-Math.sin(latitude1)*Math.cos(latitude2)*Math.cos(longDiff);

		return (Math.toDegrees(Math.atan2(y, x))+360)%360;
	}
}
