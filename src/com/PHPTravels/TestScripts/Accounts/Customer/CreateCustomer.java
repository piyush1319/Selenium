package com.PHPTravels.TestScripts.Accounts.Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.PHPTravels.TestScripts.Reusuable.ApplicationCommonMethods;
import com.PHPTravels.TestScripts.Reusuable.ApplicationSpecificMethods;
import com.PHPTravels.TestScripts.Reusuable.ResuableMethods;

public class CreateCustomer {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		ResuableMethods.config();
		WebDriver driver = new ChromeDriver();
		
		ApplicationCommonMethods.Invoke(driver);
		ApplicationCommonMethods.Login(driver);
		Thread.sleep(2000);
		//Go to Accounts Module--> Supplier
		ApplicationSpecificMethods.customer(driver);	
		//Filling Details
		ApplicationSpecificMethods.UserDeatais(driver);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();	

	}
}
