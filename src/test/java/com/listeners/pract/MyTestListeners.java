package com.listeners.pract;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class MyTestListeners {
	
	
	@Test
	public void testShree() {
		
		System.out.println("Hi");
		//throw new SkipException("this metod ");
	}

}
