package com.knorex.helper;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.knorex.constants.Configuration;
import com.knorex.helper.FlowHelper;
import org.testng.annotations.Test;
public class ElementHelper {
	private static void loadTestURLWithDriver(WebDriver driver) throws InterruptedException {
		if (driver instanceof FirefoxDriver) {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get(Configuration.testURL);
			FlowHelper.sleep(10000);
		}
	}
	
	public static WebElement elementWithXPath(String xPath, WebDriver driver) throws ElementException, InterruptedException {
		return driver.findElement(By.xpath(xPath));
	}
	
	public static void fillTextInElementWithXPath(String xPath, String text, WebDriver driver) throws ElementException {
		WebElement element = driver.findElement(By.xpath(xPath));
		Actions action = new Actions(driver);
		action.sendKeys(element, text).perform();
	}
	
	public static void clickOnElementWithXPath(String xPath, WebDriver driver) throws ElementException {
		WebElement element = driver.findElement(By.xpath(xPath));
		Actions action = new Actions(driver);
		action.click(element).perform();
	}
	
	public static void hoverOnElementWithXPath(String xPath, WebDriver driver) throws ElementException {
		WebElement element = driver.findElement(By.xpath(xPath));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
}
