package com.knorex.application;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class FirefoxInstance {
	
  WebDriver driver = new FirefoxDriver();
  
  @BeforeSuite
  public void setup() throws Exception {
	  driver.manage().window().maximize();
	  driver.get("https://ae-test.knorex.com/adedge/cms/static/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	  Thread.sleep(10000); 
		driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div[1]/input")).sendKeys("auto_tester@mailinator.com");
		driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div[3]/div[2]/button")).click();
  }

  @AfterSuite
  public void tearDown() throws Exception {
	  driver.quit();
  }
}
