package com.windowHandling.practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestParentChildWindow {

	
	public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void test_window_Handle() {
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> windows= driver.getWindowHandles();
		String name[] = new String[windows.size()];
		int i=0;
		for(String s : windows) {
			name[i] = s;	
			i++;
			}
		driver.switchTo().window(name[1]);
		WebElement we= driver.findElement(By.xpath("//p[@class='im-para red']//a"));
		String email = we.getText();
		System.out.println(email);
		driver.switchTo().window(name[0]);
		
		driver.findElement(By.name("username")).sendKeys(email);
		
	
		
		
	}
}
