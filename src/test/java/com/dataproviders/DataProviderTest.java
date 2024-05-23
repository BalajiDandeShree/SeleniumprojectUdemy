package com.dataproviders;

import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "MyData", dataProviderClass = com.dataproviders.DataProviderClass.class)
	public void testDtaProvider(String name) {
		System.out.println(name);
	}
	
}
