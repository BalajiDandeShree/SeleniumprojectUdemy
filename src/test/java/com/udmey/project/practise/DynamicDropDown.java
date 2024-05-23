package com.udmey.project.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DynamicDropDown {
	
	
	
	@Test
	public void testDynamicDropDown() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
	driver.findElement(By.xpath("(//div[@data-testid='to-testID-origin']//input")).click();
	System.out.println("Item clicked");	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(text(),'Agartala Airport')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(text(),'AMD')]")).click();
	
	
	}

}
