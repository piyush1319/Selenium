package com.PHPTravels.TestScripts.Accounts.GuestCustomer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.PHPTravels.TestScripts.Reusuable.ApplicationCommonMethods;
import com.PHPTravels.TestScripts.Reusuable.ApplicationSpecificMethods;
import com.PHPTravels.TestScripts.Reusuable.ResuableMethods;

public class CreateGuestCustomer {
	

	public static void main(String[] args) throws InterruptedException {
		
		ResuableMethods.config();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		ApplicationCommonMethods.Invoke(driver);
		
		ApplicationCommonMethods.Login(driver);
		
		//Go to Accounts Module--> Admin
	
		ApplicationSpecificMethods.GuestCustomer(driver);
		Thread.sleep(2000);
		
		//Entering Admin Details
		
		ApplicationSpecificMethods.UserDeatais(driver);
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	
		
	}
}
