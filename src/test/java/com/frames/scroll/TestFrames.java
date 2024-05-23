package com.frames.scroll;

import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFrames {
	
	public static WebDriver driver;
	

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
	
	}
	@Test
	public void test_scrolling() throws InterruptedException {
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); // this will scroll down window
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		int sum=0;
		for(WebElement s : list) {
			System.out.println(s.getText());
			sum=sum+Integer.parseInt(s.getText());
		}
		System.out.println("Sum =" + sum);
		
		String total= driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
		 if(sum==Integer.parseInt(total)) {
			System.out.println("Equals"); 
		 }
		 
		 Assert.assertEquals(sum,total," Total does not match");
	}
	
	//@Test(invocationCount = 2)
	public void shree() {
		System.out.println("count ");
}
	

}
