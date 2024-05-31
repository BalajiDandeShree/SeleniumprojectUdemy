package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoAlert {
	
	
	@Test
	public void testAlert() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver  = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");			
		
	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        
        // Accepting alert		
        alert.accept();	
        
       
        System.out.println(driver.findElement(By.cssSelector(".barone")).getText());
        Select s  = new Select( driver.findElement(By.name("cusid")));
       
       
	}

}


