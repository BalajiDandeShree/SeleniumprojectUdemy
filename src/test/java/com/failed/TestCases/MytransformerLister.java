package com.failed.TestCases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Listeners;

public class MytransformerLister implements IAnnotationTransformer {
	
   
    public void transform(ITestAnnotation annotation, 
                                                Class testClass, 
                                                Constructor testConstructor, 
                                                Method testMethod) {
    	// To set the analyzer 
		annotation.setRetryAnalyzer(FailedTestAnalyazer.class);
    }

}
