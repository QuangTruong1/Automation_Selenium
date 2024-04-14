package Buoi8_WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThucHanh_Element_AnhTester {

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
		boolean trangbaiviet = driver.findElement(By.xpath("//body/div[1]/div[1]/section[1]/h1[1]")).isDisplayed();
		if(trangbaiviet) {
			driver.findElement(By.xpath("//a[@id='btn-dangbai']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='_name_for_slug']")).sendKeys("TestDai");
			driver.findElement(By.xpath("//input[@id='_slug']")).sendKeys("TestDai");
			driver.findElement(By.xpath("//input[@id='inp_thumb']")).sendKeys("TestDai");
			driver.findElement(By.xpath("//html")).sendKeys("TestDai");
			driver.findElement(By.xpath("//iframe[@id='_name_for_des_ifr']")).sendKeys("TestDai");
			driver.findElement(By.xpath("//textarea[@id='meta_des']")).sendKeys("TestDai");
			driver.findElement(By.xpath("//body/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[11]/div[1]/div[1]/input[1]")).sendKeys("TestDai");
			driver.findElement(By.xpath("//body/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[12]/div[1]/div[1]/input[1]")).sendKeys("TestDai");
			driver.findElement(By.xpath("//iframe[@id='body_ifr']")).sendKeys("TestDai");
			
			boolean taobaiviet =  driver.findElement(By.xpath("//body/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[14]/div[1]/button[1]")).isEnabled();
			if(taobaiviet) {
				driver.findElement(By.xpath("//body/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[14]/div[1]/button[1]")).click();
			}
		}
		else {
			System.out.println("Không tìm thấy trang bài viết");
		}
		Thread.sleep(4000);
		driver.quit();
	}

}
