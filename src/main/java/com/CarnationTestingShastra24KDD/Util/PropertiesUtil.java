package com.CarnationTestingShastra24KDD.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	public static String getLocator(String key) {

		FileInputStream fis = null;
		String baseDir = System.getProperty("user.dir");
//		System.out.println(baseDir);
		String filePath = baseDir+"\\src\\test\\resources\\propertiesFIles\\Locators.properties";
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String value = prop.getProperty(key);
		return value;
	

		
	}
	
	
	public static String getLocator(String filePath,String key) {

		FileInputStream fis = null;
		try {
//			fis = new FileInputStream("C:\\Users\\Amind\\eclipse-workspace\\com.Carnation24KDD\\src\\test\\resources\\propertiesFIles\\Locators.properties");
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String value = prop.getProperty(key);
		return value;
	

		
	}
	
/*
 * following is code of how to read Properties file.
 * 	
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Amind\\eclipse-workspace\\com.Carnation24KDD\\src\\test\\resources\\propertiesFIles\\Locators.properties");	
		Properties prop = new Properties();
		prop.load(fis);
		
		String value = prop.getProperty("viewPIMModule");
		System.out.println(value);
	}
*/	

	
}
