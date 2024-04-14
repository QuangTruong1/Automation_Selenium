package Buoi18.userInterac_Actions;
//Hãy dùng với cá thao tác bàn phím, Các chữ trên bàn phím a,b,c,d,e,f....

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Initialization_KhoiTao.Init;

public class RobotClass extends Init{
	@Test
	public void testRobot() throws Exception {
		Robot robot = new Robot();
		driver.navigate().to("https://anhtester.com/");
		Thread.sleep(1000);
		WebElement getElement = driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		getElement.click();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}
}
