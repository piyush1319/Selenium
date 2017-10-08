package com.PHPTravels.TestScripts.Accounts.Admin;

import java.io.IOException;
import java.util.Arrays;


public class Demo {

		
public static void main(String[] args) throws InterruptedException, IOException {
		
		/*ResuableMethods.config();
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("input_resumeParser")).click();
		Runtime.getRuntime().exec("C:\\Users\\piyush\\Desktop\\Autoit.exe");*/
		
		String s="india";
		StringBuilder sb= new StringBuilder(s);
		//sb.append(s);
		sb.reverse();
		System.out.println(sb);
		
		int[] intArray = { 7, 9, 5, 1, 3 };
		System.out.println(Arrays.toString(intArray));
	
}
}