package com.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitUtil {
	
	
	public static void explicitWait(WebDriver driver, int timeOuts, String locator) {
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
		System.out.println(locator);
		
	}
	
	public static void explicitWait(WebDriver driver, int timeOuts, By  locator) {
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
		w.until(ExpectedConditions.visibilityOfElementLocated(locator));
		System.out.println("This is used using By class ");
		
	}

}
