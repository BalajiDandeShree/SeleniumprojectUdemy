package com.chrome.options;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utility.ScreenShot;

public class TestChromeOptions {
	
public  WebDriver driver;
ChromeOptions options;
	

	@BeforeClass
	public void setUp() {
		options= new ChromeOptions();
		options.setAcceptInsecureCerts(true); // This is for SSL certification
		driver = new ChromeDriver(options);
	
	}
	@Test
	public void test_options() throws IOException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("xyz");
		driver.get("https://expired.badssl.com/");
		ScreenShot.takeScreenShot(driver,"abc");
		//session killed by sessionID
		//driver.manage().deleteCookieNamed("sessionKey");
	
	}

}
