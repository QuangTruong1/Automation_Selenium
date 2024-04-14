package Buoi8_WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThucHanh_Element_xoaBaiViet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\PhanMem\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// 1 - Maximize browser của mình
		driver.manage().window().maximize();

		// 2 - Đi đến 1 url

		driver.navigate().to("https://anhtester.com/");
		
		driver.findElement(By.xpath("//a[@id='btn-login']")).click();
		
		driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("autotest@mailinator.com");
		driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("123456");
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[@id='login']")).click();
		driver.findElement(By.xpath("//body/section[1]/div[1]/div[2]/div[2]/ul[1]/li[4]/a[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[9]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
