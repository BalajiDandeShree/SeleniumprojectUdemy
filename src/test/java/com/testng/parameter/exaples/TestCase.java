package com.testng.parameter.exaples;

import org.testng.annotations.Test;

public class TestCase {
	
	@Test(dependsOnMethods = {"testBus"})
	public void test1() {
		System.out.println("Print test -1");
	}
	
	
	
	@Test
	public void test2() {
		System.out.println("Print test -2");
	}
	
	@Test
	public void test3() {
		System.out.println("Print test -3");
	}


}
