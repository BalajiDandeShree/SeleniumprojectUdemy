package com.testng.parameter.exaples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExample2 {

	@Test
	public void testCar() {
		System.out.println("Test Car");
	}
	
	@Test(groups = {"Sanity"},enabled = false)
	public void testBus() {
		System.out.println("Test Bus");
	}
	

	@Test(groups= {"Regression"})
	public void testTruck() {
		System.out.println("Test Truck");
	}
	
	@AfterTest
	public void testAfterTest() {
		System.out.println("After test case");
	}
	
	@BeforeTest
	public void testBeforeTest() {
		System.out.println("Print before test of eample2");
	}
	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("test Before Suite in eample 2");
	}
	
	@AfterSuite
	public void testAfterSuite() {
		System.out.println("Test After Suite example 2");
	}
	
}
