package com.testng.parameter.exaples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter2 {
	
    @Parameters({"URL"})
	@Test
	public void test_parameter2(String urlNAme ){
		
		System.out.println("Paramter Vlaue " + urlNAme);
	}
	
	@Test
	public void test_Parameter_two() {
		System.out.println("Parameter Value 2 ");
	}
	
	@Test
	public void masd(String name) {
		System.out.println("test");
	}

}