package com.CarnationTestingShastra24KDD.Util;

public class App {

	public static String getAppUrl(String env) {
		
		String baseDir = System.getProperty("user.dir");
//		System.out.println(baseDir);
		String filePath = baseDir+"\\src\\test\\resources\\propertiesFIles\\app.properties";
//		System.out.println(filePath);
		return PropertiesUtil.getLocator(filePath, env+".url");
	}
	
}
