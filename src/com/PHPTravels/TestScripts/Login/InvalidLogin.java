package com.PHPTravels.TestScripts.Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PHPTravels.TestScripts.Reusuable.ApplicationCommonMethods;
import com.PHPTravels.TestScripts.Reusuable.ResuableMethods;

public class InvalidLogin {
	
	public static void main(String[] args) throws InterruptedException {
		ResuableMethods.config();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		ApplicationCommonMethods.Invoke(driver);
		
		ApplicationCommonMethods.Login(driver);
				
				String Expected= "Invalid Login Credentials";
				
				Thread.sleep(3000);
				WebElement ActualErrorMessage=driver.findElement(By.xpath("//div[@class='alert alert-danger loading wow fadeIn animated animated']"));

				Thread.sleep(2000);
				String Actual = ActualErrorMessage.getText();
				System.out.println(Actual);
				
				
				
				if(Expected!=Actual)
				{
					System.out.println("fail");
				}
					else
						System.out.println("pass");
				}
	}
	
