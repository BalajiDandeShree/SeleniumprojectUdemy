package com.listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ITestListenersClass extends BaseClass implements ITestListener {
	
	

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Capture screen shot sucessfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			takeScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Capture screen shot sucessfully");
		
	}
	
	

}
