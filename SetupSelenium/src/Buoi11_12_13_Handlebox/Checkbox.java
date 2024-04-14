package Buoi11_12_13_Handlebox;

//hàm kiểm tra đã check chưa (isSelected) đối với các checkbox
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import Initialization_KhoiTao.*;


public class Checkbox extends Init{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Setup();	
		driver.navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		WebElement isSelected =  driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		
		if(!isSelected.isSelected()) {
			System.out.println("Chưa được check đâu");
			isSelected.click();
			Thread.sleep(1000);
			WebElement label = driver.findElement(By.xpath("//div[@id='txtAge']"));
			if(label.isDisplayed()) {
				System.out.println("Đã được check thanhf conng!");
				System.out.println(label.getText());
			} 
		}
		else {
			System.out.println("Đã được check");
		}
		
		Thread.sleep(2000);
		
		
		
		WebElement findCheckAll =  driver.findElement(By.xpath("//input[@id='check1']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", findCheckAll);
		Thread.sleep(500); 
		
		if(findCheckAll.getAttribute("value").trim().toString().equals("Check All")) {
			findCheckAll.click();
			System.out.println("Đã click vào !!");
		}
		//Cách 1
//		WebElement checkbox1 =  driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]/input[1]"));
//		WebElement checkbox2 =  driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[2]/label[1]/input[1]"));
//		WebElement checkbox3 =  driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[3]/label[1]/input[1]"));
//		WebElement checkbox4 =  driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[4]/label[1]/input[1]"));
//
//		if(checkbox1.isSelected()&&checkbox2.isSelected()&&checkbox3.isSelected()&&checkbox4.isSelected()&& findCheckAll.getAttribute("value").trim().toString().equals("Uncheck All")) {
//			System.out.println("Bạn đã chọn hết rồi");
//		}
		//Cách 2
		
//		Dùng finndElements để lấy tổng số lượng thẻ div có class là checkbox
//		Vì có nhiều class có tên là checkbox nên ta phải sử dụng findElements
		var listCheckbox = driver.findElements(By.xpath("//body/div[@id='easycont']/div[@class='row']/div[@class='col-md-6 text-left']/div[2]/div[2]/div[@class='checkbox']"));
		System.out.println(listCheckbox.size()); // In ra số lượng của checkbox
		System.out.println(listCheckbox.size());
		for(int i=1; i<=listCheckbox.size();i++) {
			WebElement checkbox = driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div["+i+"]/label[1]/input[1]"));			
			if(checkbox.isSelected()) {
				System.out.println("Đã check vào checkbox " +i);
			}else {
				System.out.println("Chưa check vào checkbox " +i);
			}
		}
		
		WebElement button_uncheckall = findCheckAll;
		if(button_uncheckall.getAttribute("value").trim().toString().equals("Uncheck All")) {
			System.out.println("Bạn đã check hết rồi đó");
		}else {
			System.out.println("có vẻ sai sai");
		}
		TearDown();
	}

}
