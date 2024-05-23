package com.cart.operatio;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utility.ExplicitwaitUtil;

import dev.failsafe.Timeout;

public class CartTest {

	public static WebDriver driver;
	public static WebDriverWait w ;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		w = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	@Test
	public void addItemsTest() throws InterruptedException {

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String products[] = { "Carrot", "Tomato", "Brinjal" };

		addItems(products);

	}

	public static void addItems(String[] products) throws InterruptedException {
		List<WebElement> webElementList = driver.findElements(By.cssSelector(".product-name"));
		List itemNeeded = Arrays.asList(products);
		int j = 0;
		System.out.println(itemNeeded.contains(webElementList.get(3)));

		for (int i = 0; i < webElementList.size(); i++) {
			String name[] = webElementList.get(i).getText().split("-");
			String formatedName = name[0].trim();

			if (itemNeeded.contains(formatedName)) {
				System.out.println(formatedName + webElementList.get(i).getText());
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == products.length) {
					break;
				}

				// driver.findElement(By.cssSelector("a[class='increment']")).click();

			}
		}

		driver.findElement(By.cssSelector("a[class='cart-icon']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		ExplicitwaitUtil.explicitWait(driver, 5, "input.promoCode");
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		//Explicit wait
		//ExplicitwaitUtil.explicitWait(driver, 5, "span[class='promoInfo']");
		
	//	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		
		
		By b = By.cssSelector("span[class='promoInfo']");
		ExplicitwaitUtil.explicitWait(driver, 5, b);
		String s = driver.findElement(By.cssSelector("span[class='promoInfo']")).getText();
		System.out.println("Promo code " + s);
		Assert.assertEquals(s, "Code applied ..!","Coupen code does not match");

	}

}
