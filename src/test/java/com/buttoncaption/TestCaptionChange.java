package com.buttoncaption;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaptionChange {
	
	//@Test
	public void testCaption() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\selenium\\HTML code for practice\\shree.html");
		WebElement cta = driver.findElement(By.id("myButton"));
		System.out.println(cta.getText());
		cta.click();
		System.out.println(cta.getText());
		Thread.sleep(3000);
		
	}
	@Test
	public void testDuplicateKey() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("100", "Shree");
		map.put("100", "Shree");
		
		for(String s : map.keySet()) {
			System.out.println(s);
			System.out.println(map.get(s));
		}
	}

}
