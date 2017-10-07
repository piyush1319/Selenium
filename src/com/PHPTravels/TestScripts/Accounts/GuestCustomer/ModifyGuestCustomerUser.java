package com.PHPTravels.TestScripts.Accounts.GuestCustomer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PHPTravels.TestScripts.Reusuable.ApplicationCommonMethods;
import com.PHPTravels.TestScripts.Reusuable.ApplicationSpecificMethods;

public class ModifyGuestCustomerUser {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ApplicationCommonMethods.Invoke(driver);
	ApplicationCommonMethods.Login(driver);
	ApplicationSpecificMethods.GuestCustomer(driver);
	
	driver.findElement(By.xpath("//a[.='ayush@sinha.com']/../../..//a[@title='Edit']")).click();
	
	driver.findElement(By.xpath("//input[@name='fname']")).clear();
	driver.findElement(By.xpath("//input[@name='fname']")).clear();
	driver.findElement(By.xpath("//input[@name='lname']")).clear();
	driver.findElement(By.xpath("//input[@type='email']")).clear();
	driver.findElement(By.xpath("//input[@name='password']")).clear();
	driver.findElement(By.xpath("//input[@name='mobile']")).clear();
	driver.findElement(By.xpath("//input[@name='address1']")).clear();
	driver.findElement(By.xpath("//input[@name='address2']")).clear();
	
	ApplicationSpecificMethods.ModifyUser(driver);
	
	//driver.findElement(By.xpath("//button[.='Submit']")).click();

	}
}
