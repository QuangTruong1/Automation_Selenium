package Buoi11_12_13_Handlebox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Initialization_KhoiTao.Init;

public class radiobutton extends Init{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Setup();
		driver.navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
//***Radio button
//		WebElement radioMale = driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]"));
//		if(!radioMale.isSelected()) {
//			radioMale.click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
//			Thread.sleep(500);
//			WebElement checkvalue = driver.findElement(By.className("radiobutton"));
//			WebElement radioFemale = driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[1]/div[2]/label[2]/input[1]"));
//			if(checkvalue.getText().equals("Radio button 'Male' is checked")&& !radioFemale.isSelected()) {
//				System.out.println("MÀY VỪA CLICK VÀO giới tính Male rồi đó");	
//			}else if(radioFemale.isSelected()) {
//				System.out.println("fail rồi, không được chọn cả male cả female đâu em!!");
//			}
//			
//		}else {
//			System.out.println("Sẵn là click rồi");
//		}
//***Group Radio Buttonnn
		WebElement radiobutton515 = driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[2]/label[2]/input[1]"));
		if(!radiobutton515.isSelected()) {
			radiobutton515.click();
			System.out.println("Bạn vừa chọn tuổi từ 5-15 rồi đó");
			driver.findElement(By.xpath("//button[contains(text(),'Get values')]")).click();
			WebElement getvalue = driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/p[2]"));
			if(getvalue.getText().trim().toString().contains("5 - 15")) {
				System.out.println("Bạn vừa chọn đúng button radio tuổi từ 5-15 rồi đó");
			}
			WebElement radiobutton05 = driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[2]/label[1]/input[1]"));
			WebElement radiobutton1550 = driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[2]/label[3]/input[1]"));
			if(radiobutton05.isSelected()|| radiobutton1550.isSelected()) {
				System.out.println("mày làm sai sai rồi đó");
			}
			
		}else {
			System.out.println("Bạn đã chojnn tuổi từ 5-15 rồi!!");
		}
		
		
		
		TearDown();
	}	
}
