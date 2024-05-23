package com.failed.TestCases;

import org.testng.Assert;

import org.testng.annotations.Test;

public class TestFailedCases {
	
	@Test
	public void testShree() {
		System.out.println("shree project");
	}
	
	
	//By using parameter in test with retryAnalyzer
	@Test(retryAnalyzer = com.failed.TestCases.FailedTestAnalyazer.class)
	public void testShreeTwo() {
		System.out.println("Second project");
		Assert.assertTrue(false);
	}
	
	

}
