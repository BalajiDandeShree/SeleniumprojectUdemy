package com.testng.parameter.exaples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
	
    @Parameters({"URL","shree"})
	@Test
	public void test_parameter(String urlNAme, String d) {
		
		System.out.println("Paramter Vlaue " + urlNAme+ " second value is  " + d);
		
	}
	@Parameters("URL1")
	@Test
	public void test_Parameter_one(String url) {
		System.out.println("Parameter Value 2 " +url);
		Assert.assertTrue(false);
		
	}

}
