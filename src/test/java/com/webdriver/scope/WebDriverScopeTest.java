package com.webdriver.scope;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverScopeTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		
		
	}
	
	//@Test
	public void testWebDriverScope() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com/");
		System.out.println("Total links "+driver.findElements(By.tagName("a")).size());
		
		//Here we user scope of driver
		WebElement footerDriver = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1d09ksm r-18u37iz r-1wtj0ep']")); 
		
		System.out.println("Link present in footer section "+footerDriver.findElements(By.tagName("a")).size());
		List<WebElement> list = footerDriver.findElements(By.tagName("a"));
		
		for(WebElement s : list) {
			 System.out.println(s.getTagName());
			 s.click();
		}
	}
		@Test
		public void OpenLinkInNewTabTest() {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://qaclickacademy.com/");
			String openinnewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			driver.findElement(By.xpath("//div[@class='button float-left']/a")).sendKeys(openinnewTab);
			
			String s = driver.getWindowHandle();
			System.out.println(driver.switchTo().window(s).getTitle());
			
		}
		
		
		
	
	
	

}
