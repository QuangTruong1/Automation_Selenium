package Buoi11_12_13_Handlebox;

import Initialization_KhoiTao.Init;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Dropdown extends Init{
	public static void main(String[] args) throws Exception {
		Setup();
		driver.navigate().to("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
//		Handle dropdown tĩnh
//		Lấy element của thẻ "Select" html
		WebElement element = driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select selectSimple = new Select(element);
//		Select theo hiển thị của index
		selectSimple.selectByVisibleText("Sunday");
		Thread.sleep(1000);
//		Select theo Index
		selectSimple.selectByIndex(3);
		Thread.sleep(2000);
//		Select theo Value của dropdown
		selectSimple.selectByValue("Monday");
//		selectSimple.sele
		
		if(selectSimple.isMultiple()) {
			System.out.println("Nó là mutiple nhé");
		}else {
			System.out.println("Nos k phair mutiple nhes");
		}
		Thread.sleep(1000);
		
//		Kiểm tra số lượng thẻ Option
		System.out.println(selectSimple.getOptions().size());
		
//		Kiểm tra giá trị optionn đã được chạy
		System.out.println(driver.findElement(By.xpath("//select[@id='select-demo']")).getText());
		System.out.println(selectSimple.getFirstSelectedOption().getText());
		if(selectSimple.getFirstSelectedOption().getText().equals("Monday")) {
			System.out.println("chạy đúng rồi đấy.");
		}
		else {
			System.out.println("Sai vl rồi");
		}
		
//		lấy ra tất cả các option 
		List <WebElement> getAllOptionn =  selectSimple.getOptions();
		for (int i = 0; i < getAllOptionn.size(); i++) {
			getAllOptionn.get(i).getText();
		}
		
		System.out.println("Chạy oke nhé");
		
// **** Dropdown động
//		Nếu item không trùng thì sendKeys đúng rồi nhấn Enter
//		Nếu item trùng thì sendKeys tên rồi click cái tên (Text) cần
		
		TearDown();
	}
}
