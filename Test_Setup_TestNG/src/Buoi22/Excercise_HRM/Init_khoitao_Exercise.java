package Buoi22.Excercise_HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Initialization_KhoiTao.Init;

public class Init_khoitao_Exercise extends Init{
	public void InitKhoiTao() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://hrm.froid.works/admin/dashboard");
		WebElement iconcopyElement =  driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]/i[1]"));
		Assert.assertTrue(!iconcopyElement.isSelected());
		iconcopyElement.click();
		driver.findElement(By.xpath("//body/div[3]/form[1]/div[4]/button[1]/i[1]")).click();
		Thread.sleep(2000);
		String titString =  js.executeScript("return document.title;").toString();
		Assert.assertEquals(titString, "HRM - Dashboard");
		System.out.println(titString);
		
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		String titEmployeeString =  js.executeScript("return document.title;").toString();
		Assert.assertEquals(titEmployeeString, "HRM - Employees");
		
		Thread.sleep(2000);
	}
}
