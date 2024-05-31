package com.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestWait {
	
	@Test
	public void test() {
		
		WebDriver driver = new ChromeDriver();
		Wait<WebDriver> w = new WebDriverWait(driver, Duration.ofSeconds(1000));
		w.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.id(""))));
		
		//Fluent wait
		
		 Wait<WebDriver> wait
         = new FluentWait<WebDriver>(driver)
               .withTimeout(Duration.ofSeconds(40))
               .pollingEvery(Duration.ofSeconds(3))
               .ignoring(TimeoutException.class);   
		 
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("my_element")));    
		 element.click();
		 
		
	}

}
