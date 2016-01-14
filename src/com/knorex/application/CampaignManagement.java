package com.knorex.application;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CampaignManagement extends FirefoxInstance{
  @Test
  public void normalcampaign() throws InterruptedException {
	  Actions actionBuilder = new Actions(driver);
	  
	  actionBuilder.click(driver.findElement(By.xpath("id('P21')/a"))).build().perform(); //why not dashboard
	  Thread.sleep(3000);
	  
	  actionBuilder.click(driver.findElement(By.xpath("//a/button[@class='btn default title-bar-btn']"))).build().perform(); //wrong xpath
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("id('info-campaign-name')")).sendKeys("campaign 1");
	  
	  actionBuilder.click(driver.findElement(By.xpath("id('tab1')/div[2]/div[2]/div[1]/div/div/span[1]/label"))).build().perform();
	  
	  driver.findElement(By.xpath("id('info-budget')")).sendKeys("100");
	  
	  driver.findElement(By.xpath("id('create-client-form')/div/div/div[3]/div/div/a[2]")).click();
	  
	  Select size = new Select(driver.findElement(By.xpath("id('info-bd-size-1')")));
	  size.selectByVisibleText("Big Vertical Rectangle (300x600)");
	  
	  actionBuilder.click(driver.findElement(By.xpath("id('create-client-form')/div/div/div[3]/div/div/button"))).build().perform();
	  
	 
	  
  }
}
