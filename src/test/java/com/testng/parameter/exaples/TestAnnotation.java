package com.testng.parameter.exaples;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class TestAnnotation {
	
	@Test(invocationCount = 3,expectedExceptions = {IOException.class, FileNotFoundException.class} )
	public void testAnnotation() {
		System.out.println("Shree Ganesh");
	
	}

}
