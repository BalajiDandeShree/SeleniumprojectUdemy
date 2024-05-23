package com.udmey.project.practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutoSuggestiveDropDown {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void testAutoSuggestiveDropDown() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(700));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("in");
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		for(WebElement wb : list) {
			
			System.out.println(wb.getText());
			if(wb.getText().equals("Indonesia")) {
				
				wb.click();
				break;
			}
		}
		
		System.out.println(driver.findElement(By.xpath("//input[@id='autosuggest']")).getText());
	}
	
	
	
	//@Test
	public void testCheckBox() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(700));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	}
	//@Test
	public void testRadioButton() {
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(700));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		System.out.println(driver.findElement(By.name("Div1")).getAttribute("style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.name("Div1")).getAttribute("style"));

	}

}
