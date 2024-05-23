package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	/*
	 * public static void main(String arg[]) throws IOException {
	 * 
	 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("https://rahulshettyacademy.com/AutomationPractice/"); String
	 * filename = new Date().toString(); filename = filename.replaceAll("\\s",
	 * "").replaceAll(":",""); String s= ".\\ScreenShot\\"+filename+".png";
	 * 
	 * File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(src, new File(s));
	 * 
	 * //System.out.println(s);
	 * 
	 * }
	 */
	
	public static  void takeScreenShot(WebDriver driver,String testName) throws IOException {
		String filename = new Date().toString();
		filename = filename.replaceAll("\\s", "").replaceAll(":","");
		filename = filename.concat(testName);
		String s= ".\\ScreenShot\\"+filename+".png";
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File(s));
		FileUtils.copyFile(src, new File(s));
	
	}

}
