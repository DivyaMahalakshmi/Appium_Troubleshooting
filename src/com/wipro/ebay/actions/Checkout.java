package com.wipro.ebay.actions;

import org.openqa.selenium.By;

import com.wipro.ebay.utils.PropertyUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import static com.wipro.ebay.constants.WebElementConstants.*;

import java.util.concurrent.TimeUnit;

public class Checkout {
	
	//Method to perform checkout
	public void checkoutAction(AppiumDriver<MobileElement> driver)
	{
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath(CHECKOUT)).click();
		driver.findElement(By.xpath(PAYMENT)).click();
		driver.findElement(By.xpath(CREDIT_OPTION)).click();
		driver.findElement(By.xpath(CARDNUMBER)).sendKeys(PropertyUtils.getProperty("cardnumber"));
		driver.findElement(By.xpath(EXPIRY)).sendKeys(PropertyUtils.getProperty("expiry"));
		driver.findElement(By.xpath(SECURITY_CODE)).sendKeys(PropertyUtils.getProperty("security"));
		driver.findElement(By.xpath(DONE_BUTTON)).click();
		System.out.println("Checkout is successful");

	}
	
	

}
