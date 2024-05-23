package com.action.practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAction {

	public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
	}

	 //@Test
	public void testMouseOver() {
		driver.manage().window().maximize();

		driver.get("https://www.udemy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.xpath("//button[@id='popper-trigger--5']")).getText());

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//button[@id='popper-trigger--5']"))).build().perform();
	}

	@Test
	public void send_Capital_Letters() {
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions actions = new Actions(driver);
		WebElement search = driver.findElement(By.name("q"));
		actions.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();

		// For Right click use context click method
		actions.moveToElement(search).contextClick().build().perform();
	}
}
