package Buoi7_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopee {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\PhanMem\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 1 - Maximize browser của mình
		driver.manage().window().maximize();

		// 2 - Đi đến 1 url

		driver.navigate().to("https://daotao.hutech.edu.vn/Default.aspx?page=gioithieu");

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
//				click vaof button Login
//				Button, input, link. dropdown, dialog, header_InvetoryPage.....
		WebElement Textlink_Quenmatkhau = driver.findElement(By.partialLinkText("Quên"));
		Textlink_Quenmatkhau.click();
		Thread.sleep(1000);
		WebElement input_taikhoan = driver.findElement(By.xpath("//*[@id=\"fullname\"]"));
		input_taikhoan.sendKeys("Deptraiquacoduockhong");
		Thread.sleep(1000);
		WebElement button_TieptucElement = driver.findElement(By.xpath("//*[@id=\"registration\"]/div[5]/div/div/button[2]"));
		button_TieptucElement.click();
		Thread.sleep(3000);
//		WebElement input_mssv = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ctl00_ucDangNhap_txtTaiKhoa\"]"));
//		input_mssv.sendKeys("2011068765");
//		WebElement input_password = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ctl00_ucDangNhap_txtMatKhau\"]"));
//		input_password.sendKeys("Hoangphuonglinh1@");
//		WebElement button_login_account = driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ctl00_ucDangNhap_btnDangNhap\"]"));
//		button_login_account.click();
//		Thread.sleep(2000);
//		WebElement Textlink_Trangchu = driver.findElement(By.xpath("//*[@id=\"ctl00_menu_lblTrangChu\"]"));
//		Textlink_Trangchu.sendKeys("2011068765");
//		WebElement Textlink_forgot_password = driver.findElement(By.linkText("Forgot my password?"));
//		Textlink_forgot_password.click();
//		Thread.sleep(1000);
//		WebElement input_forgot_password = driver.findElement(By.name("email"));
//		input_forgot_password.sendKeys("quangtruongdz9009@gmail");
//		Thread.sleep(2000);
//		WebElement button_Reset_password = driver.findElement(
//				By.xpath("//*[@id=\"style-7\"]/section[2]/div/div/div/div/div[2]/div/form/div/div[2]/div/button"));
//		button_Reset_password.click();
		// Thoát hẳn Browser
		driver.quit();
	}
}
