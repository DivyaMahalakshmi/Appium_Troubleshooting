package com.wipro.ebay.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtils {
	
	public static String getProperty(String Key)
	{
		Properties prop = new Properties();
		try {
			InputStream inputStream = getClassMethod().getClassLoader().getResourceAsStream("resources/WebElementDetails.properties");
		    //load a properties file from class path, inside static method
		   
					prop.load(inputStream);
					
		    return prop.getProperty(Key);
		    
		    
		} 
		catch (IOException ex) {
		    ex.printStackTrace();
		}
		catch (Exception ex) {
		    ex.printStackTrace();
		}
		
		return null;
	}

	
	private static Class getClassMethod()
	{
		
		return new PropertyUtils().getClass();
	}
	
}
