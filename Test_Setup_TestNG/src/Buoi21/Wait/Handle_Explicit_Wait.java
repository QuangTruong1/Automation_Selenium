package Buoi21.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Initialization_KhoiTao.Init;

public class Handle_Explicit_Wait extends Init{
	
	@Test
	public void ExplicitWaitDemo() {
		driver.get("https://anhtester.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 1);
//		kiểm tra xem một phần tử có tồn tại trong DOM hoặc có hiển thị hay không
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Website Testing')]")));
//		Điều kiện mong đợi là chờ một phần tử có thể click được
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Website Testing')]")));
		driver.findElement(By.xpath("//h3[contains(text(),'Website Testing')]")).click();
		

	}
}
