package Buoi21.Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import Initialization_KhoiTao.HelpersCommon;
import Initialization_KhoiTao.Init;

public class Handle_Fluent_Wait extends Init{
	@Test
	public void FluentWaitDemo() {
		driver.get("https://anhtester.com/");
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);
		
		WebElement buttonSigninElement = driver.findElement(By.xpath("//a[@id='btn-login']"));
		HelpersCommon.WaitAndClick(buttonSigninElement,5);
		
		WebElement buttonUsernameElement = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		WebElement buttonPassWordElement = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		WebElement buttonLoginElement = driver.findElement(By.xpath("//button[@id='login']"));
		buttonUsernameElement.sendKeys("autotest@mailinator.com");
		buttonPassWordElement.sendKeys("123456");
		HelpersCommon.WaitAndClick(buttonLoginElement,7);
		
	}
	
}
