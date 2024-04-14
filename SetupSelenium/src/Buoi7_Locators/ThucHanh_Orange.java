package Buoi7_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThucHanh_Orange {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\PhanMem\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 1 - Maximize browser của mình
		driver.manage().window().maximize();

		// 2 - Đi đến 1 url

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// 3 - Lấy Title và in ra console

		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement textbox_User1 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"));
		textbox_User1.sendKeys("wrongUser");
		Thread.sleep(1000);
		WebElement textbox_Password1 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]"));
		textbox_Password1.sendKeys("wrongpassword");
		Thread.sleep(2000);
		WebElement button_login = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]"));
		button_login.click();
		Thread.sleep(2000);
		WebElement textbox_User2 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"));
		textbox_User2.sendKeys("Admin");
		Thread.sleep(1000);
		WebElement textbox_Password2 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]"));
		textbox_Password2.sendKeys("admin123");
		Thread.sleep(3000);
		WebElement button_login2 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]"));
		button_login2.click();
		Thread.sleep(3000);
		WebElement textbox_search = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/input[1]"));
		textbox_search.sendKeys("time");
		Thread.sleep(2000);
		WebElement link_Time = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
		link_Time.click();
		Thread.sleep(2000);
		WebElement button_View = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]"));
		button_View.click();
		Thread.sleep(2000);
		WebElement button_Edit = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/button[1]"));
		button_Edit.click();
		Thread.sleep(2000);
		WebElement button_Save = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/button[3]"));
		button_Save.click();
		Thread.sleep(2000);
		WebElement textbox_Project = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		textbox_Project.sendKeys("ACME");
		Thread.sleep(2000);
//		WebElement icon_Down = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"));
//		icon_Down.click();
//		Thread.sleep(2000);
//		WebElement link_Element = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]/2"));
//		link_Element.click();
		Thread.sleep(4000);
		driver.quit();
	}
}
