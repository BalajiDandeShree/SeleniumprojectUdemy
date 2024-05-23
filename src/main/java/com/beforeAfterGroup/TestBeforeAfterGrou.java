package com.beforeAfterGroup;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestBeforeAfterGrou {
	
	
	
	@BeforeGroups("sanity")
	public void setUp() {
		System.out.println("Call before Group method this is setup ");
	}
	
	@Test(groups = {"sanity"})
	public void sanity_1() {
		System.out.println("Sanity 1 called");
	}
	@Test(groups = {"sanity"})
	public void sanity_2() {
		System.out.println("Sanity 2 called");
	}
	@Test(groups = {"regression"})
	public void regression() {
		System.out.println("regression  called");
	}
	@BeforeGroups("regression")
	public void setUpa() {
		System.out.println("Call before Group method this is setup ");
	}

}
