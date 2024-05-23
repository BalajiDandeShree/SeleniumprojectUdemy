package com.testng.parameter.exaples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExample3 {
	
	@Test(groups = {"Smoke","Sanity","Regression"})
	public void testOne() {
		System.out.println("Test one");
	}
	
	@Test(groups= {"Regression"})
	public void testTwo() {
		System.out.println("Test two");
	}
	

	@Test
	public void testThree() {
		System.out.println("Test three");
	}

	@BeforeTest @Test(groups = {"Smoke",})
	public void testBeforeTest() {
		System.out.println("Print before test of eample");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("test Before Suite in eample 3");
	}
	
	@AfterSuite
	public void testAfterSuite() {
		System.out.println("Test After Suite example 3");
	}
	
	
}
