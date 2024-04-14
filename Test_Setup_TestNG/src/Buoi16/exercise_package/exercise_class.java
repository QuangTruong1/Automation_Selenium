package Buoi16.exercise_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class exercise_class {

	public WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\PhanMem\\Selenium\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void Demo1() throws InterruptedException {
		driver.navigate().to("http://chatgpt.com");
		Thread.sleep(1000);	
		WebElement chatboxElement = driver.findElement(By.xpath("//textarea[@id='prompt-textarea']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", chatboxElement);
		
		chatboxElement.sendKeys("Tìm người yêu");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	
//	@Test
//	public void Demo2() {
//		driver.navigate().to("http://google.com");
//	}
//	@Test
//	public void Demo3() {
//		driver.navigate().to("http://facebook.com");
//	}

	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
