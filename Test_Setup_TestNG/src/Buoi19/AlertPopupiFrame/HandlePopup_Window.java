package Buoi19.AlertPopupiFrame;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Initialization_KhoiTao.Init;

public class HandlePopup_Window extends Init {
	@Test
	public void PopupWindowdemo() throws Exception {
		driver.navigate().to("https://demo.seleniumeasy.com/window-popup-modal-demo.html");
		WebElement twitterElement = driver.findElement(By.xpath("//a[contains(text(),'Follow On Twitter')]"));
		Assert.assertEquals(twitterElement.getText(), "Follow On Twitter");
		twitterElement.click();

		// Lưu lại lớp window đầu tiên - mã ID hơi dài, in ra sẽ thấy :)
		String MainWindow = driver.getWindowHandle();
		System.out.println("Lớp cha nè" + MainWindow);

		// Lấy tất cả các mã định danh Tab Window.
		Set<String> windows = driver.getWindowHandles();

		// Set là một Collection để lưu các phần tử giá trị KHÔNG trùng lặp.
		// Cách duyệt từng phần tử không trùng lặp trong Collection (Set) - Java Basic
		for (String window : windows) {
			System.out.println(window);
			if (!MainWindow.equals(window)) {
				// So sánh nếu thằng nào khác thằng Chính (đầu tiên) thì chuyển hướng qua nó mới
				// thao tác được
				// Chuyển hướng driver đến Tab mới (Tab con)
				driver.switchTo().window(window);
				Thread.sleep(1000);
				System.out.println("Đã chuyển đến Tab Window mới");
//              //Một số hàm hỗ trợ
				System.out.println(driver.switchTo().window(window).getTitle());
				System.out.println(driver.switchTo().window(window).getCurrentUrl());
				Thread.sleep(1000);
				// Sau khi chuyển hướng sang Tab mới thì getText cái header
//				System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
				// Tắt cái Tab Window mới.
				Thread.sleep(1000);
				driver.close();
			}
		}
//		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
}
