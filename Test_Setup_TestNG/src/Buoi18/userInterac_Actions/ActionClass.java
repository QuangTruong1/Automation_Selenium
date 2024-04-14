package Buoi18.userInterac_Actions;
//Actionn -> moveToElement(); dragAndDrop (from, to) -> Kéo từ phần từ này đến phần tử khác


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Initialization_KhoiTao.Init;

public class ActionClass extends Init{
	@Test
	public void TestAction() throws InterruptedException {
		Actions actions = new Actions(driver);
		
		driver.navigate().to("https://google.com");
		WebElement gettextsearchElement = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
//		Enter
		actions.sendKeys(gettextsearchElement,"anh Tester").build().perform();
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
//		Click
		WebElement clicklinkElement = driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]"));
		actions.click(clicklinkElement).build().perform();
		Thread.sleep(1000);
//		Double click
		WebElement doubleclickAnhTesterElement = driver.findElement(By.xpath("//div[@class='col-lg-7']//h2[@class='section__title'][contains(text(),'Anh Tester')]"));
		actions.doubleClick(doubleclickAnhTesterElement).build().perform();
//		Move to
		WebElement movetoElementayne = driver.findElement(By.xpath("//body/section[6]/div[3]/div[1]/div[1]/div[1]/div[2]/a[1]"));
		actions.moveToElement(movetoElementayne).build().perform();
//		contextclick click chuột phaiir
		actions.contextClick(movetoElementayne).build().perform();
	}
	
	@Test(priority = 0)
	public void dragAndDrop () throws Exception {

		  driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		  Thread.sleep(1000);

		  // Bắt element cần kéo
		  WebElement From = driver.findElement(By.xpath("//div[@id='box6']"));
		  // Bắt element cần thả đến
		  WebElement To = driver.findElement(By.xpath("//div[@id='countries']//div[1]"));

		  Thread.sleep(1000);;
		  Actions action = new Actions(driver);
		  // Kéo và thả
		  action.dragAndDrop(From, To).build().perform();
//		  action.sendKeys(Keys.F5);
		  Thread.sleep(1000);
	}
	
	
	
}
