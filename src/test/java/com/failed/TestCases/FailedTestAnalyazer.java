package com.failed.TestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTestAnalyazer implements IRetryAnalyzer {
	int count = 0;
	int maxTry=2;

	@Override
	public boolean retry(ITestResult result) {
		if(count<maxTry) {
			System.out.println("try " + count);
			count++;
			return true;
			}
		
		return false;
	}

}
