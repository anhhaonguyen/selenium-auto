package com.knorex.driverinstance;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite; 

public class FirefoxInstance { 
	//Declared as public static to use same webdriver instance publicly 
	public static WebDriver driver = new FirefoxDriver(); 
	//@BeforeSuite annotation describes this method has to run before all suites
	@BeforeSuite public void setup() throws Exception { 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		driver.get("https://ae-test.knorex.com/adedge/cms/static/");
		Thread.sleep(10000); 
		driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div[1]/input")).sendKeys("auto_tester@mailinator.com");
		driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div[3]/div[2]/button")).click();
		} 
	//@AfterSuite annotation describes this method has to run after execution of all suites
	@AfterSuite
	public void tearDown() throws Exception { 
		driver.quit(); 
	} 
}
