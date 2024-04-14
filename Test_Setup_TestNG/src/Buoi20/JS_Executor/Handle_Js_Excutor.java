package Buoi20.JS_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.testng.annotations.Test;
// Click vào 1 Element (Buttonn,...) js.executeScript("arguments[0].click();", buttonLogin);
// Để cuộn tới 1 phần tử để (driver.click hoặc JS.excutor.click -> js.executeScript("arguments[0].scrollIntoView(true);", element);
// Sử dụng lệnh như JS -> js.executeScript("return document.URL;").toString(); || js.executeScript("alert('Hello');");

import Initialization_KhoiTao.Init;

public class Handle_Js_Excutor extends Init{
	@Test (alwaysRun = false)
	public void JsExcutorDemo() throws Exception {
//		Tạo đối tượng JavacripExcutor interface object
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://anhtester.com/");
		Thread.sleep(1000);
//		Click vào 1 đường link bất kì
		WebElement buttonElement = driver.findElement(By.xpath("//h3[contains(text(),'Website Testing')]"));
		js.executeScript("arguments[0].click();", buttonElement);
		Thread.sleep(1000);
//	Lấy tiêu đề trang và Domain trang Bằng JSExcutor
		String titleText = js.executeScript("return document.title;").toString();
		System.out.println("title Text is: "+titleText);
		 
		String urlText = js.executeScript("return document.URL;").toString();
		System.out.println("url Text is: "+urlText);
		
		String domainText = js.executeScript("return document.domain;").toString();
		System.out.println("domain Text is: "+domainText);
	}
	
	@Test (priority = 0)
	public void JsExcutorDemo2() throws Exception {
//		Tạo đối tượng JavacripExcutor interface object
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		js.executeScript("document.getElementById(\"isAgeSelected\").checked =true;\r\n");
		Thread.sleep(2000);
		js.executeScript("document.getElementById(\"isAgeSelected\").checked =false;\r\n");
		Thread.sleep(1000);
	}
	
	@Test (priority = 1)
	public void JSScrollAndClickDemo() throws Exception {
//		Tạo đối tượng JavacripExcutor interface object
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://anhtester.com/");
		WebElement viewprofilElement = driver.findElement(By.xpath("//a[contains(text(),'view profile')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", viewprofilElement);
		js.executeScript("arguments[0].click();",viewprofilElement); //->click vafo được button mặc dù bị khuất
//		viewprofilElement.click();									 // -> Không click vào được button vì bị khuất
		Thread.sleep(2000);
	}
}
