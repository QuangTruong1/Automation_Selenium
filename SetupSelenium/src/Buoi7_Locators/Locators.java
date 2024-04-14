package Buoi7_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectLoginpage.Object;

public class Locators{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\PhanMem\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 1 - Maximize browser của mình
		driver.manage().window().maximize();

		// 2 - Đi đến 1 url

		driver.navigate().to("https://anhtester.com");

		// 3 - Lấy Title và in ra console

		System.out.println(driver.getTitle());

		// Thoát hẳn Browser
		// Locators
		// - Thuộc tính: id, name, className, linkText, partialLinkText
		// - Css Selectors: color, background, background-image, type cuar input,
		// placeholder
		// - Xpath: tuong đối(//), tuyệt đối(/) //span[text() = 'blog'] -> Xpath tương
		// đối, có nghĩa là thẻ span nào có text là blog thiflaasy nó <span> blog
		// </span>
//		click vaof button Login
//		Button, input, link. dropdown, dialog, header_InvetoryPage.....


		WebElement button_login = driver.findElement(By.id("btn-login"));
		button_login.click();
		WebElement input_email = driver.findElement(By.name("email"));
		input_email.sendKeys("quangtruongdz9009@gmail.com");
		WebElement input_password = driver.findElement(By.name("password"));
		input_password.sendKeys("quangtruongdz9009@gmail");
		WebElement button_login_account = driver.findElement(By.id("login"));
//		object.button_login1.click();
		button_login_account.click();
		Thread.sleep(2000);
		WebElement Textlink_forgot_password = driver.findElement(By.linkText("Forgot my password?"));
		Textlink_forgot_password.click();
		Thread.sleep(1000);
		WebElement input_forgot_password = driver.findElement(By.name("email"));
		input_forgot_password.sendKeys("quangtruongdz9009@gmail");
		Thread.sleep(2000);
		WebElement button_Reset_password = driver.findElement(By.xpath("//*[@id=\"style-7\"]/section[2]/div/div/div/div/div[2]/div/form/div/div[2]/div/button"));
		button_Reset_password.click();
		Thread.sleep(3000);
		WebElement button_dangnhap = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[4]/p[1]/a[1]"));
		button_dangnhap.click();
		Thread.sleep(2000);
		// Thoát hẳn Browser
		driver.quit();
	}
}
