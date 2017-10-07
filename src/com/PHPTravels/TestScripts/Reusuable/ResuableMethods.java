package com.PHPTravels.TestScripts.Reusuable;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class ResuableMethods {
	
	public static void config(){
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	
	
	//close browser is used to close all browsers
	public static void closeBrowser(WebDriver driver){
		driver.quit();
	}
	
	
	//Close Browser will close current browser
	public static void closeCurrentBrowser(WebDriver driver){
		driver.close();
	}
	
	
	//Close all browser will close
	public static void closeALLBrowser(WebDriver driver){
		Set<String> lwinHandles = driver.getWindowHandles();
		for(String a:lwinHandles){
			driver.switchTo().window(a);
			driver.close();
		}
  	
	}
	
}
