package com.streasalenium.practise;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebTableSorted {
	
	public  WebDriver driver;
	
	@BeforeClass
	public void setUp() {

		driver = new ChromeDriver();
	
	}
	
	@Test
	public void sortedWebTable() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> list = driver.findElements(By.xpath("//table[@name='courses']//td[2]"));
		
		
		
		List<String> lds= list.stream().filter(s-> s.getText().contains("Learn JMETER from Scratch - (Performance + Load) Testing Tool"))
		.map(s-> getCourcePrice(s)).collect(Collectors.toList());
		
		lds.stream().forEach(f->System.out.println(f));
		
		
		
	}

	public  String getCourcePrice(WebElement w) {
		String p =w.findElement(By.xpath("following-sibling::td")).getText();
		return p;
	}
	

}
