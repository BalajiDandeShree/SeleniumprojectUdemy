package com.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WaitUitility {
	
	
	
	public static void setImplicitWait(WebDriver driver, int timeOut) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
		
	}

}
