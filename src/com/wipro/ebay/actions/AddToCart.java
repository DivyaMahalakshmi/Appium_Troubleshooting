package com.wipro.ebay.actions;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import static com.wipro.ebay.constants.WebElementConstants.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddToCart {
	
	public void addToCart(AppiumDriver<MobileElement> driver)
	{
		//driver.findElement(By.xpath(ADD_TO_CART)).click();
		
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS); 

List<MobileElement> quantity_dropdown = driver.findElements(By.xpath(QUANTITY));
quantity_dropdown.get(3).click();
		
		MobileElement scroll_addToCart = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/data_view\")).scrollIntoView("
				+ "new UiSelector().text(\"ADD TO BASKET \"))"));
		scroll_addToCart.getLocation();
		
driver.findElement(By.xpath(BASKET_ICON)).click();

		
	}

}
