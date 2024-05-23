package com.windowHandling.practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestWindowHandle {
	
	 
	
	@Test
	public void testWindowHandles() throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String parientid = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> windows= driver.getWindowHandles();
		
		for(String a : windows) {
			if(parientid.equals(a)) {
			
		}else {
			driver.switchTo().window(a);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='login-btn']/a[@class='theme-btn']")).click();
			driver.close();
		}
			driver.switchTo().window(parientid);
			
			System.out.println(driver.getTitle());	
		
	}

}
}
