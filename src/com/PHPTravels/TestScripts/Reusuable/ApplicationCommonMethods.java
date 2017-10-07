package com.PHPTravels.TestScripts.Reusuable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ApplicationCommonMethods {
	
	public static String parent;
	public static int i;
	public static final String path="./data/Excel.xlsx";
	
	
	public static void Invoke(WebDriver driver){
		
		parent = driver.getWindowHandle();
		driver.manage().deleteAllCookies();
		driver.get("http://www.phptravels.net/admin");
		driver.manage().window().maximize();
	}
	
	public static void Login(WebDriver driver){
		
		
		
		int rowcnt = ExcelResuable.getRowCount(path,"Login");
		for(i = 1;i<=rowcnt;i++){
			
			String UserName=ExcelResuable.getCellValue(path, "Login", i, 0);
			String PassWord=ExcelResuable.getCellValue(path, "Login", i, 1);
		
			
		driver.findElement(By.xpath("//input[@name='email'][1]")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PassWord);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	}
	
	public static void Logoff(WebDriver driver){
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//i[]@class='fa fa-sign-out'")).click();
		
	}
	

}
