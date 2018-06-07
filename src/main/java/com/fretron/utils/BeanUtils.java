package com.fretron.utils;


import com.fretron.Model.Device;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class BeanUtils {

	public static void copy(Object dest, Object source) throws Exception {
		BeanInfo beanInfo = Introspector.getBeanInfo(source.getClass());
		PropertyDescriptor[] pdList = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor pd : pdList) {
			Method writeMethod = null;
			Method readMethod = null;
			try {
				writeMethod = pd.getWriteMethod();
				readMethod = pd.getReadMethod();
			} catch (Exception e) {
			}

			if (readMethod == null || writeMethod == null) {
				continue;
			}

			Object val = readMethod.invoke(source);
			if(val != null)
			writeMethod.invoke(dest, val);
		}
	}

	public static void main(String[] args){

		Device d = new Device("12" , "12" , "123" , null , null , null , null , null,null,null,null,null,null,null);
		Device d1 = new Device(null , "12" , "1233" , "adf" , "dfsa" , null , null , null,null,null,null,null,true,null);
		try {
			copy(d , d1);
			System.out.print(d.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}