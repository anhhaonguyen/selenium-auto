package com.knorex.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UserManagement extends FirefoxInstance{
  @Test
  public void create_advertiser() throws InterruptedException {
	  Actions actionBuilder = new Actions(driver);
	  Action moveAction = actionBuilder.moveToElement(driver.findElement(By.xpath("id('nav-menu')/li[8]/a/i"))).build();
	  moveAction.perform();
	  Thread.sleep(5000);
		
	  driver.findElement(By.xpath("id('P02')/a")).click();
	  
	  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/a/button"));
	  
	  driver.findElement(By.xpath("id('info-name')")).sendKeys("Test Publisher");
	  
	  Select country = new Select(driver.findElement(By.xpath("id('info-country')")));
	  country.selectByVisibleText("Singapore");
	  Thread.sleep(3000);
	  
	  Select currency = new Select(driver.findElement(By.xpath("id('info-currency')")));
	  currency.selectByVisibleText("SGD (Singapore Dollar");
	  
	  driver.findElement(By.xpath("id('info-address')")).sendKeys("123 abc");
	  
	  driver.findElement(By.xpath("id('info-tax')")).sendKeys("30%");
	  
	  //upload image
	  
	  
	  
  }
  public void create_internal_user() throws InterruptedException { 
		Actions actionBuilder = new Actions(driver);
		Action moveAction = actionBuilder.moveToElement(driver.findElement(By.xpath("id('nav-menu')/li[8]/a/i"))).build();
		moveAction.perform();
		Thread.sleep(5000);
		
		actionBuilder.click(driver.findElement(By.xpath("id('P05')/a/i"))).build().perform();
		Thread.sleep(3000);
		
		actionBuilder.click(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/a/button"))).build().perform();
		Thread.sleep(3000);
		
		WebElement radioBtn = driver.findElement(By.xpath("id('knorex-user')"));
		radioBtn.click();
		Thread.sleep(3000);
		
		Select role = new Select(driver.findElement(By.xpath("id('info-roles')")));
		role.selectByVisibleText("Tester Manager");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("id('info-email')")).sendKeys("tester_mng@mail.com");
		
		driver.findElement(By.xpath("id('info-name')")).sendKeys("Tester Manager");
		
		driver.findElement(By.xpath("id('info-publishers-block')/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("id('info-publishers-block')/div/div/ul/li[2]/a/label")).click();
		actionBuilder.click(driver.findElement(By.xpath("id('info-publishers-block')/div/div/button"))).build().perform();//how can we click again
		
		actionBuilder.click(driver.findElement(By.xpath("id('info-advertisers-block')/div/div/button"))).build().perform();
		Thread.sleep(2000);
		actionBuilder.click(driver.findElement(By.xpath("id('info-advertisers-block')/div/div/ul/li[2]/a/label"))).build().perform();
		actionBuilder.click(driver.findElement(By.xpath("id('info-advertisers-block')/div/div/button"))).build().perform();
		
		actionBuilder.click(driver.findElement(By.xpath("id('info-agencies-block')/div/div/button"))).build().perform();
		Thread.sleep(2000);
		actionBuilder.click(driver.findElement(By.xpath("id('info-agencies-block')/div/div/ul/li[2]/a/label"))).build().perform();
		actionBuilder.click(driver.findElement(By.xpath("id('info-agencies-block')/div/div/button"))).build().perform();
		
		actionBuilder.click(driver.findElement(By.xpath("id('info-affiliates-block')/div/div/button"))).build().perform();
		Thread.sleep(2000);
		actionBuilder.click(driver.findElement(By.xpath("id('info-affiliates-block')/div/div/ul/li[2]/a/label"))).build().perform();
		actionBuilder.click(driver.findElement(By.xpath("id('info-affiliates-block')/div/div/button"))).build().perform();
		
		actionBuilder.click(driver.findElement(By.xpath("id('sub-role-wrap')/div/div/button"))).build().perform();
		Thread.sleep(2000);
		actionBuilder.click(driver.findElement(By.xpath("id('sub-role-wrap')/div/div/ul/li[1]/a/label"))).build().perform();
		actionBuilder.click(driver.findElement(By.xpath("id('sub-role-wrap')/div/div/button"))).build().perform();
		
		actionBuilder.click(driver.findElement(By.xpath("id('create-user-btn')"))).build().perform();
  }
}