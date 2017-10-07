package com.PHPTravels.TestScripts.Accounts.Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.PHPTravels.TestScripts.Reusuable.ApplicationCommonMethods;
import com.PHPTravels.TestScripts.Reusuable.ApplicationSpecificMethods;
import com.PHPTravels.TestScripts.Reusuable.ResuableMethods;


public class CreateAdminUser extends ApplicationCommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		ResuableMethods.config();
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		ApplicationCommonMethods.Invoke(driver);
		
		ApplicationCommonMethods.Login(driver);
		
		//Go to Accounts Module--> Admin
	
		ApplicationSpecificMethods.account(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
		//Validating the page
		String Expected= "Add Admin";
		String Actual = driver.findElement(By.xpath("//div[@class='panel-heading']")).getText();
		System.out.println(Actual);
		
		if(Actual.equals(Expected)){
			System.out.println("Valid Add User Page");
		}
		else
			System.out.println("Invalid Add User Page");		
		
		//Entering Admin Details
		
		ApplicationSpecificMethods.UserDeatais(driver);
	
		/*WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='addCars']/..")));
		driver.findElement(By.xpath("//input[@value='addCars']/..")).click();
		driver.findElement(By.xpath("//input[@value='editCars']/..")).click();
		driver.findElement(By.xpath("//input[@value='deleteCars']/..")).click();*/
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		//driver.findElement(By.xpath(".//*[@id='content']/form/div/div[3]/button")).click();	
	}		

}



