package com.udmey.project.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandlingAlert {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
	}

	// @Test
	public void testAlert() throws InterruptedException {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(700));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.name("enter-name")).sendKeys("Balaji");
		driver.findElement(By.id("alertbtn")).click();
		String s = driver.switchTo().alert().getText();
		System.out.println(s.contains("Balaji"));
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

	@Test
	public void testAlert1() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(700));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.name("enter-name")).sendKeys("Balaji");
		driver.findElement(By.id("confirmbtn")).click();
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
	}

}
