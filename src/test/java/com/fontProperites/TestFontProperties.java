package com.fontProperites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFontProperties {
	
	
	@Test
	public void testFontProperties() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.findElement(By.name("q")).getCssValue("font-size"));
	}
	

}
