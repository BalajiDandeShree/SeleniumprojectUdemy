package com.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	
	@DataProvider(name = "MyData")
	public String[] getData() {
		String name[]= {"Balaji","Shree","dil"};
		return name;
	}

}
