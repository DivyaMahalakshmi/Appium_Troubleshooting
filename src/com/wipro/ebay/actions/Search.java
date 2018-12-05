package com.wipro.ebay.actions;

import static com.wipro.ebay.constants.WebElementConstants.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Search {
	
	//Method to Search 
	
	public void searchAction(AppiumDriver<MobileElement> driver) {
		
		driver.findElement(By.xpath(SEARCH)).sendKeys("eyeLiner");

		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS); 
		driver.findElement(By.xpath(SEARCH_RESULT)).click();
		driver.findElement(By.xpath(RESULT_ITEM)).click();
		System.out.println("Required Item is selected");

	}

}