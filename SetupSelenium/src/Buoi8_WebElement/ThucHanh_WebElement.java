package Buoi8_WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThucHanh_WebElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\PhanMem\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// 1 - Maximize browser của mình
		driver.manage().window().maximize();

		// 2 - Đi đến 1 url

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// 3 - Lấy Title và in ra console

		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
		WebElement textbox_Username =driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"));
		textbox_Username.sendKeys("Admin");
//		Thread.sleep(1000);	
		WebElement textbox_Password =driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]"));
		textbox_Password.sendKeys("admin123");
//		Thread.sleep(1000);	
		WebElement button_Login = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]"));
		button_Login.click();
//		Thread.sleep(2000);	
		WebElement textbox_Search = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/input[1]"));
		textbox_Search.sendKeys("My");
		Thread.sleep(1000);	
		WebElement link_MyInfo = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
		link_MyInfo.click();
//		Thread.sleep(2000);
		WebElement edit_textbox_Fullname = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]"));
		edit_textbox_Fullname.clear();
//		Thread.sleep(1000);
		edit_textbox_Fullname.sendKeys("Văn Quang Trường");
//		Thread.sleep(1000);
		WebElement edit_textbox_IdEmployee = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		edit_textbox_IdEmployee.clear();
//		Thread.sleep(1000);
		edit_textbox_IdEmployee.sendKeys("2011068765");
		WebElement button_save = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/button[1]"));
		if(button_save.isEnabled()) {
			button_save.click();
		}
		else {
			WebElement display_fullname = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
			display_fullname.sendKeys("Văn Quang Trường nè~~");
		}
		Thread.sleep(2000);		
		driver.quit();
	}
}
