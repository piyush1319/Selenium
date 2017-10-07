package com.PHPTravels.TestScripts.Accounts.Admin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PHPTravels.TestScripts.Reusuable.ApplicationCommonMethods;
import com.PHPTravels.TestScripts.Reusuable.ApplicationSpecificMethods;
import com.PHPTravels.TestScripts.Reusuable.ExcelResuable;

public class DeleteAdminUsers extends ApplicationCommonMethods {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ApplicationCommonMethods.Invoke(driver);
		ApplicationCommonMethods.Login(driver);
		ApplicationSpecificMethods.account(driver);
		
		String email=ExcelResuable.getCellValue(path, "Admin", i, 2);
		
		String Deleted="Entries not found.";
		String NotDeleted=driver.findElement(By.xpath("//a[.='"+email+"']/../../..//a[@title='DELETE']")).getText();
		System.out.println(NotDeleted);
		if(Deleted.equals(NotDeleted)){
			System.out.println("Entry Not Deleted");
		}
			else
				System.out.println("SuccessFully Deleted");
		System.out.println("--------------------------------------------");
		driver.findElement(By.xpath("//a[.='"+email+"']/../../..//a[@title='DELETE']")).click();
		Alert al=driver.switchTo().alert();
		al.accept();	
	}

}
