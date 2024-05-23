package com.frame.dragdrop.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFrame {
	public  WebDriver driver;
	
	@BeforeClass
	public void setUp() {

		driver = new ChromeDriver();
	
	}
	
	@Test
	public void test_frame() {
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement w1 =  driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(w1);   //driver.switchTo().frame(0); //driver.switchTo().frame(id1);		
		
		
		
		
		WebElement src = driver.findElement(By.cssSelector("div[id='draggable']"));
		src.click();
		WebElement target = driver.findElement(By.cssSelector("div[id='droppable']"));
		Actions action = new Actions(driver);
		//action.dragAndDrop(src, target).build().perform();
		
		action.dragAndDropBy(src, 172,36 ).build().perform();
		driver.switchTo().defaultContent(); //  Back to window from iframe
		
		
	}

}
