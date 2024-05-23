package com.listeners;

import java.io.File;


import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
public  static WebDriver driver;
	

@BeforeSuite
	public void setUp() {
		driver = new ChromeDriver();
	
	}


public   void takeScreenShot() throws IOException {
	String filename = new Date().toString();
	filename = filename.replaceAll("\\s", "").replaceAll(":","");
	
	String s= ".\\ScreenShot\\"+filename+".png";
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File(s));
}


}
