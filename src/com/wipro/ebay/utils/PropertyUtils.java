package com.wipro.ebay.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
	
	public static String getProperty(String Key)
	{
		Properties prop = new Properties();
		try {
		    //load a properties file from class path, inside static method
		    prop.load(PropertyUtils.class.getClassLoader().getResourceAsStream("WebElementDetails.properties"));

		    return prop.getProperty(Key);
		    
		    
		} 
		catch (IOException ex) {
		    ex.printStackTrace();
		}
		
		return null;
	}

}
