package com.dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest {
	
	@Test(dataProvider = "getData")
	public void test(String s, int f) {
		System.out.println(s+"  = "+ f);
		
		
	}
	@DataProvider
	public Object[][] getData(){
		
		Object [][]s = { {"John", 30},
	            {"Alice", 25},
	            {"Bob", 35}};
		return s;
		
	}

}
