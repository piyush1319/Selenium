package com.PHPTravels.TestScripts.Reusuable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationSpecificMethods  extends ApplicationCommonMethods{
	
	public static void account(WebDriver driver){
		driver.findElement(By.xpath("//span[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Admins']")).click();
	}
	public static void GuestCustomer(WebDriver driver){
		driver.findElement(By.xpath("//span[text()='Accounts']")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Accounts']")));
		driver.findElement(By.xpath("//span[text()='Accounts']")).click();
		
		driver.findElement(By.xpath("//a[@href='http://www.phptravels.net/admin/accounts/guest/']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	}
	
	public static void Supplier(WebDriver driver){
		driver.findElement(By.xpath("//span[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Suppliers']")).click();
	}
	public static void customer(WebDriver driver){
		driver.findElement(By.xpath("//span[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Customers']")).click();
	
	}

	public static void SupplierDetails(WebDriver driver){
		WebElement Status = driver.findElement(By.name("status"));
		Select S1=new Select(Status);
		S1.selectByVisibleText("Disabled");
		
		WebElement SupplierFor = driver.findElement(By.name("applyfor"));
		Select S2=new Select(SupplierFor);
		S2.selectByVisibleText("Tours");
		
		driver.findElement(By.name("itemname")).sendKeys("Ayush");
		driver.findElement(By.xpath("//input[@name='newssub']/..")).click();
		
		WebElement Hotels = driver.findElement(By.name("hotels[]"));
		Select S3=new Select(Hotels);
		S3.selectByVisibleText("Hyatt Regency Perth");
		S3.selectByVisibleText("Jumeirah Beach Hotel");
		
		WebElement Tours = driver.findElement(By.name("tours[]"));
		Select S4=new Select(Tours);
		S4.selectByVisibleText("6 Days Around Thailand");
		S4.selectByVisibleText("Spectaculars Of The Nile 3 Nights");
		
		WebElement Cars = driver.findElement(By.name("cars[]"));
		Select S5=new Select(Cars);
		S5.selectByVisibleText("Opel Astra 2014");
		
		
		//giving Permission
		driver.findElement(By.xpath("//input[@ value='addCars']/..")).click();
		driver.findElement(By.xpath("//input[@ value='editTours']/..")).click();
		driver.findElement(By.xpath("//input[@ value='deletelocations']/..")).click();
	}
	public static void UserDeatais(WebDriver driver){
	
	int rowcnt = ExcelResuable.getRowCount(path,"Admin");
	for(i = 1;i<=rowcnt;i++){
		
		String fname=ExcelResuable.getCellValue(path, "Admin", i, 0);
		String lname=ExcelResuable.getCellValue(path, "Admin", i, 1);
		String email=ExcelResuable.getCellValue(path, "Admin", i, 2);
		String password=ExcelResuable.getCellValue(path, "Admin",i, 3);
		String mobno=ExcelResuable.getCellValue(path, "Admin", i, 4);
		String add1=ExcelResuable.getCellValue(path, "Admin", i, 5);
		String add2=ExcelResuable.getCellValue(path, "Admin", i, 6);
		
	driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(fname);
	driver.findElement(By.xpath("//input[@name='lname']")).sendKeys(lname);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys(mobno);
	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(add1);
	driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(add2);
	
	WebElement drop = driver.findElement(By.name("country"));
	Select s= new Select(drop);
	s.selectByVisibleText("India");
	driver.findElement(By.xpath("//ins[@class='iCheck-helper']")).click();
	}
		}
	
	public static void ModifyUser(WebDriver driver){
		
		int rowcnt = ExcelResuable.getRowCount(path,"Modify");
		for(i = 1;i<=rowcnt;i++){
			
			String fname=ExcelResuable.getCellValue(path, "Modify", i, 0);
			String lname=ExcelResuable.getCellValue(path, "Modify", i, 1);
			String email=ExcelResuable.getCellValue(path, "Modify", i, 2);
			String password=ExcelResuable.getCellValue(path, "Modify",i, 3);
			String mobno=ExcelResuable.getCellValue(path, "Modify", i, 4);
			String add1=ExcelResuable.getCellValue(path, "Modify", i, 5);
			String add2=ExcelResuable.getCellValue(path, "Modify", i, 6);
			
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys(mobno);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(add1);
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(add2);
		
		WebElement drop = driver.findElement(By.name("country"));
		Select s= new Select(drop);
		s.selectByVisibleText("Hong Kong");
		driver.findElement(By.xpath("//ins[@class='iCheck-helper']")).click();
	
    	}
	
		
		
	}
}

