package com.screeShot.practise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.listeners.BaseClass;

public class TestScreenShotonFailures extends BaseClass{
	

	@Test (testName = "Title test")
	public void test_login() {
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Google1", driver.getTitle());
		softAssert.assertAll();
		
	}
	


}
