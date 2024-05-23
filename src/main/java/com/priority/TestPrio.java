package com.priority;
import org.testng.annotations.Test;
public class TestPrio {
	
	
	 @Test(priority = -1)
	public void shree1() {
		System.out.println("1");
	}
	 @Test//(priority = 1)
		public void shree2() {
		 System.out.println("2");
			
		}
	 @Test//(priority = 2)
		public void shree3() {
		 System.out.println("3");
		}
	 @Test//(priority = -1)
		public void shree4() {
		 System.out.println("4");
			
		}
	 

}
