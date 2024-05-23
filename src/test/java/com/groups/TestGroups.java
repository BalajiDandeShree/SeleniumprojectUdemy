package com.groups;

import org.testng.annotations.Test;

public class TestGroups {
	
	@Test(groups = {"sanity","regression"})
	public void shreeTest() {
		System.out.println("Test group ");
	}
	
	
	@Test
	public void shreeTestOne() {
		System.out.println("Test group one");
	}
	
	@Test(groups = {"sanity"})
	public void shreeTestTwo() {
		System.out.println("Test group two");
	}

}
