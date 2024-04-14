package Buoi19.AlertPopupiFrame;

//driver.switchTo().alert().dismiss(); ->Cancel hoặc X | driver.switchTo().alert().accept(); -> Ok 
//driver.switchTo().alert().sendkeys("string"); -> gettext cho đoạn box | driver.switchTo().alert().gettext(); -> Lấy đoạn text

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Initialization_KhoiTao.Init;

public class Handle_AlertPopupiFrame extends Init{
	@Test
	public void Handle_Alert() throws Exception {
		driver.navigate().to("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		WebElement botton_ClickElement =  driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/button[1]"));
		Assert.assertEquals(botton_ClickElement.getText(), "Click me!");		
		botton_ClickElement.click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		WebElement bottonClick2Element = driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/button[1]"));
		Assert.assertEquals(bottonClick2Element.getText(), "Click me!");
		bottonClick2Element.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		WebElement bottonClick3Element = driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]"));
		Assert.assertEquals(bottonClick3Element.getText(), "Click for Prompt Box");
		bottonClick3Element.click();
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.BACK_SPACE).build().perform();
		
//		Trường hợp có sendkeys
//		Thread.sleep(1000);
//		driver.switchTo().alert().sendKeys("47");
//		driver.switchTo().alert().accept();
//		boolean gettElement = driver.findElement(By.xpath("//p[@id='prompt-demo']")).getText().contains("47");
//		Assert.assertTrue(gettElement);
//		Trường hợp khoonng senndkeys
//		Thread.sleep(1000);
//		bottonClick3Element.click();
		driver.switchTo().alert().dismiss();
		boolean gettElementt = driver.findElement(By.xpath("//p[@id='prompt-demo']")).isDisplayed();
		Assert.assertFalse(gettElementt);
		
		Thread.sleep(1000);
	}
}
