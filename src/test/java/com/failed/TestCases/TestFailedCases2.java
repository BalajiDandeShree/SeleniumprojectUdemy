package com.failed.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailedCases2 {
	
	@Test
	public void testShree() {
		System.out.println("shree project");
		Assert.assertTrue(false);
	}
	
	
	//without using parameter in test with retryAnalyzer
	@Test
	public void testShreeTwo() {
		System.out.println("Second project");
		Assert.assertTrue(false);
	}
	
	

}
