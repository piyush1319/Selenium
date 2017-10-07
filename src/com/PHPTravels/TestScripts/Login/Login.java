package com.PHPTravels.TestScripts.Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.PHPTravels.TestScripts.Reusuable.ApplicationCommonMethods;
import com.PHPTravels.TestScripts.Reusuable.ResuableMethods;

public class Login {
	

	public static void main(String[] args) {
		
		ResuableMethods.config();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		ApplicationCommonMethods.Invoke(driver);
		
		ApplicationCommonMethods.Login(driver);
		driver.close();
	}
}

