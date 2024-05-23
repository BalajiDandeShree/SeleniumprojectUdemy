package com.attributeValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AttributeValue {
	
	@Test(expectedExceptions = {InterruptedException.class})
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.cssSelector(".accent-nav__login-button"));
		Thread.sleep(3000);
		System.out.println(d.getAttribute("href"));
	
		
		
	}

}
