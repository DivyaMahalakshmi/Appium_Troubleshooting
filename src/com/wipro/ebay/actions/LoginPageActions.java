package com.wipro.ebay.actions;

import org.openqa.selenium.By;

import com.wipro.ebay.utils.PropertyUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import static com.wipro.ebay.constants.WebElementConstants.*;

import java.util.concurrent.TimeUnit;





public class LoginPageActions {
	
	// Method to perform login action
	public void loginAction(AppiumDriver<MobileElement> driver)
	{
		driver.findElement(By.xpath(SIGN_IN_BUTTON)).click();
		

		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS); 
		driver.findElement(By.id(USERNAME_FIELD)).sendKeys(PropertyUtils.getProperty("username"));
		driver.findElement(By.id(PASSWORD_FIELD)).sendKeys(PropertyUtils.getProperty("password"));
		driver.findElement(By.id(SINGIN_SUBMIT)).click();
		System.out.println("User logged in succesfully");
		

}
}