package com.fretron.utils.compressedPolylineUtils.reducer;

public class PointImpl implements Point {
    
    private double x;
    
    private double y;

    private long timeStamp;
    
    public PointImpl(double x, double y,long timeStamp) {
        this.x = x;
        this.y = y;
        this.timeStamp = timeStamp;
    }

    public static Point p(double x, double y,long timeStamp) {
        return new PointImpl(x, y,timeStamp);
    }

    public double getX() {
        return x;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public long getT() {
        return timeStamp;
    }
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PointImpl other = (PointImpl) obj;
        if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
            return false;
        return Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }


}
