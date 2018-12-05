package com.wipro.ebay.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.wipro.ebay.actions.AddToCart;
import com.wipro.ebay.actions.Checkout;
import com.wipro.ebay.actions.LoginPageActions;
import com.wipro.ebay.actions.Search;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import static com.wipro.ebay.utils.PropertyUtils.*;

public class BaseProgram {
	
public static void main(String[] args) {
	
		AppiumDriver<MobileElement> driver = null;
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", getProperty("deviceName"));
		caps.setCapability("udid", getProperty("udid")); 
		caps.setCapability("platformName", getProperty("platformName"));
		caps.setCapability("platformVersion", getProperty("platformVersion"));
		
		
		// Giving in details of ebay app Package and app Activity to launch 
		caps.setCapability("appPackage", getProperty("appPackage"));
		caps.setCapability("appActivity", getProperty("appActivity"));
		caps.setCapability("noReset", getProperty("noReset"));
		
		//Instantiate Appium Driver
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		
		//Added 5 seconds wait so that the app loads completely before starting with element identification
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Find Google Play element using ID property and click on it
		
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS); 
		
		
		LoginPageActions login_Action = new LoginPageActions();
		Search  searchAction = new Search();
		AddToCart addCart = new AddToCart();
		Checkout checkout_Action = new Checkout();
		
		login_Action.loginAction(driver);
		searchAction.searchAction(driver);
		addCart.addToCart(driver);
		checkout_Action.checkoutAction(driver);
	
		
		
		
		
		//xpath = //android.widget.LinearLayout[@content-desc="Sign in or Register"]/android.widget.LinearLayout/android.widget.Button[2]
		
		
		////driver.findElement(By.id("com.android.vending:id/search_box_text_input")).sendKeys("Google");
		
		//Press Enter key from Keyboard using any of the below methods
		//((AndroidDriver<MobileElement>) driver).pressKeyCode(66);
		//OR
		//The below code might now work for you, as some keyboards use Search button instead of ENTER. Hence,
		// there are chances that the below line would fail on specific devices
		//driver.findElement(By.id("com.android.vending:id/search_box_text_input")).sendKeys(Keys.ENTER);
	}
}
