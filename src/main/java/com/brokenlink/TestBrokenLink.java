package com.brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBrokenLink {
	
	WebDriver driver;
	SoftAssert softAssert;
	
	@BeforeClass
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver = new ChromeDriver();
		
		softAssert = new SoftAssert();
		

	}
@Test
public void test_brokenLink() throws MalformedURLException, IOException {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	
	/*String url =driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
	   System.out.println(url);
	 * HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
	 * conn.setRequestMethod("HEAD"); conn.connect();
	 * System.out.println(conn.getResponseCode());
	 * 
	 * 
	 * System.out.println(list.size());
	 */
	
	/*WebElement scope = driver.findElement(By.id("gf-BIG"));
	List<WebElement> list = scope.findElements(By.tagName("a"));
	for(WebElement e : list) {
		String url = e.getAttribute("href");
		//System.out.println(url);
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		//System.out.println(conn.getResponseCode());
		
		 * if (conn.getResponseCode()>=400) { System.out.println("URL = "+url);
		 * System.out.println("code "+conn.getResponseCode()); }
		 
		
		
		softAssert.assertTrue(conn.getResponseCode()<400,"Response code"+conn.getResponseCode()+  "with link"+ url );*/
		
	}
	//softAssert.assertAll();
	// For comment please check }} bracket

	
	
	
	
}


