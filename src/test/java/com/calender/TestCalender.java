package com.calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCalender {

	WebDriver driver;
	WebDriverWait w;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		w = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@Test
	public void testCalender() throws InterruptedException {
		String year = "2027";
		String month = "11";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//input[@name='month']")).click();
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();

		
		List<WebElement> listYear = driver.findElements(
				By.xpath("//button[@class='react-calendar__tile react-calendar__decade-view__years__year']"));
		// System.out.println("Year "+listYear.size());

		// System.out.println(list.get(0).getText().contains(year));
		for (WebElement e : listYear) {

			if (e.getText().contains(year)) {
				e.click();
				
				System.out.println(e.getTagName());
				break;
			}
		}

		List<WebElement> listMonth = driver.findElements(
				By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']"));
		System.out.println("Month " + listMonth.size());
		for (int i = 1; i <= listMonth.size(); i++) {
			int mon = Integer.parseInt(month);
			if (i == mon) {
				Thread.sleep(5);
				listMonth.get(i).click();
				
				System.out.println(listMonth.get(i).getText());
				break;
			}

		}

	}

}
