package com.udmey.project.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDowns {
	
	@Test
	public void droupDownTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(700));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	/*	Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		select.selectByValue("AED");
		System.out.println(select.getFirstSelectedOption().getText());
		*/
		
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();

		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

		//Select departureCity = new Select();
		//departureCity.selectByValue("")
		
		System.out.println(driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText());
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div[id='divpaxinfo']")).getText(), "2 Adult","More Adults are selected");
		
	
	}

}
