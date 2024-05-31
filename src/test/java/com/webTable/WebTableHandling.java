package com.webTable;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableHandling {
	
	@Test
	public void testWebTable() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@name='courses']//tr//th/parent::tr/following-sibling::tr"));
		
		System.out.println(tableRows.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@name='courses']//tr//th"));
			
		System.out.println(col.size());
		
		String search = "25";
		
		for(int i = 1 ;i<=tableRows.size();i++) {
			for(int j=1;j<=col.size();j++) {
				WebElement d = driver.findElement(By.xpath("//table[@name='courses']//tr//th/parent::tr/following-sibling::tr["+i+"]//td["+j+"]"));
				if(search.equals(d.getText())){
					System.out.println("given String presnt at row = "+ i +"and col =" + j);
					break;
				}
			}
		}
		
	
		
	}

}
