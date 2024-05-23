package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestExceptio {
	
	@Test
	public void shree() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		driver.findElement(By.name("q"));
		driver.manage().timeouts().implicitlyWait(null);
		
	}

}
