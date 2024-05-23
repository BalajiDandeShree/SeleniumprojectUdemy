package com.udmey.project.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDebug {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
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
