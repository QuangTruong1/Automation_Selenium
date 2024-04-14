package Buoi11_12_13_Handlebox;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Initialization_KhoiTao.Init;

public class Dropdown_Donng extends Init{
	public static void main(String[] args) throws Exception {
		Setup();
		driver.navigate().to("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index2.html");
//	
		Thread.sleep(2000);
		WebElement clickLocaltion = driver.findElement(By.xpath("//span[contains(text(),'Select a Location')]"));
		clickLocaltion.click();
		
		WebElement getsearch = driver.findElement(By.xpath("//body/section[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		getsearch.sendKeys("Vietnam");
		System.out.println("getsearch.getText()");
		
		Thread.sleep(2000);
		Actions action = new Actions(driver); 
//		Hàm build() để xây dựng hành động cho action, hàm perform() để xác định xây dựng đó
//		Hàm bổ trợ nè
		action.sendKeys(Keys.ENTER).build().perform();
		
//		Robot tương tự action
//		Robot robot = new Robot();
		
		Thread.sleep(2000);
		TearDown();
	}
	
}
