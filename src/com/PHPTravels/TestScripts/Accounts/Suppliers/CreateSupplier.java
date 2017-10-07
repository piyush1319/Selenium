package com.PHPTravels.TestScripts.Accounts.Suppliers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.PHPTravels.TestScripts.Reusuable.ApplicationCommonMethods;
import com.PHPTravels.TestScripts.Reusuable.ApplicationSpecificMethods;
import com.PHPTravels.TestScripts.Reusuable.ResuableMethods;

public class CreateSupplier {
		
	public static void main(String[] args) throws InterruptedException {
		
ResuableMethods.config();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		ApplicationCommonMethods.Invoke(driver);
		
		ApplicationCommonMethods.Login(driver);
		
		ApplicationSpecificMethods.Supplier(driver);
		
		Thread.sleep(2000);
		
		ApplicationSpecificMethods.UserDeatais(driver);
		
		ApplicationSpecificMethods.SupplierDetails(driver);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();	
	}
}
