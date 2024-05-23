package com.pageLoadtimeOut;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoPageLoadTimeOut {
	
	@Test
	public void testLoadTime() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
		//driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(2));
	}

}
