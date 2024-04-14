package Buoi19.AlertPopupiFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Initialization_KhoiTao.Init;

public class Handle_Iframe extends Init{
	@Test
	public void IFrameDemo() throws Exception {
		driver.get("https://anhtester.com/contact");
		
//		Tìm số lượng Iframe có trong trang web ****************
		int frametotal = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frametotal);
		
		Thread.sleep(10000);
//		Chuyển đến frame nào đó thứ tự *********** Nếu không phải Iframe ta muốn thực hiện thì thay đổi số 0->1,2,3,4
		driver.switchTo().frame(0);
//		Chuyển đến frame nào đó Name/id
//		-> driver.switchTo().frame("dialog-frame");
		WebElement element = driver.findElement(By.className("welcomePageModalSheetContent"));
		System.out.println(element.getText());
		
		
	}
}
