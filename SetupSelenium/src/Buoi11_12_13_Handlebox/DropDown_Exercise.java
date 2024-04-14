package Buoi11_12_13_Handlebox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Initialization_KhoiTao.Init;
import Validation.*;

public class DropDown_Exercise extends Init{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Setup();
		driver.navigate().to("https://techydevs.com/demos/themes/html/listhub-demo/listhub/all-categories.html#");
		Thread.sleep(3000);
		Validationn validationn = new Validationn();
	
		WebElement buttonAddlist = driver.findElement(By.xpath("//div[@class='nav-right-content ms-auto']"));
		buttonAddlist.click();
		
		WebElement clickcity = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[3]/div[2]/form[1]/div[5]/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickcity);
		Thread.sleep(3000);
		WebElement clickcityyy = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[3]/div[2]/form[1]/div[8]/div[1]/div[1]/div[1]/a[1]"));
		clickcityyy.click();
		
		WebElement textsearchElement = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[3]/div[2]/form[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		textsearchElement.sendKeys("Boston");
		
//		Hỗ trợ bấm Enter
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		WebElement regionElement = driver.findElement(By.xpath("//span[contains(text(),'Boston')]"));
		validationn.checkText(regionElement, "Boston");
//		if(regionElement.getText().equals("Boston")) {
//			System.out.println("Mày chọn đúng rồi đó");
//		}
		
		WebElement phonenumElement = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[3]/div[2]/form[1]/div[9]/div[1]/div[1]/input[1]"));
		phonenumElement.sendKeys("0812341234");
		
		
//		Pricey Details
		
//		1. Price Range
		WebElement priceyrace = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[4]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
		
		WebElement PriceDetailsss = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[4]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PriceDetailsss);
		Thread.sleep(2000);
		priceyrace.click();
		
		WebElement searchpriceyElement = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[4]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		searchpriceyElement.sendKeys("$$ Moderate");
		actions.sendKeys(Keys.ENTER).build().perform();
		
		WebElement getnamepriceyElement = driver.findElement(By.xpath("//span[contains(text(),'$$ Moderate')]"));
		validationn.checkText(getnamepriceyElement, "$$ Moderate");
//		if(getnamepriceyElement.getText().equals("$$ Moderate")) {
//			System.out.println("CHojnnn chuẩn rồi đó!!");
//		}
		
//		2. Get minn pricey		
		WebElement getpriceyMiinnElement = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[4]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]"));
		getpriceyMiinnElement.sendKeys("100000");

//		3. Get max pricey		
		WebElement getpriceyMaxElement = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[4]/div[2]/form[1]/div[3]/div[1]/div[1]/input[1]"));
		getpriceyMaxElement.sendKeys("200000");
		
//		4. Opening Hours
		WebElement OpeningHours = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[5]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", OpeningHours);
//			4.1 time openn Monday 
		WebElement openMondayElement = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]"));
		openMondayElement.click();
		
		WebElement searchTimeMonnndayElement = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]"));
		searchTimeMonnndayElement.sendKeys("07:30 am");
		actions.sendKeys(Keys.ENTER).build().perform();
		
		WebElement openMondayElementtt = driver.findElement(By.xpath("//span[contains(text(),'07:30 am')]"));
		validationn.checkText(openMondayElementtt, "07:30 am");
//		if(openMondayElementtt.getText().equals("07:30 am")){
//			System.out.println("Mayf chon dunng Open thứ luc 7h30 sanng roi do");
//		}
		
//		4.2 time close Monday 
	WebElement closeMondayElement = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/a[1]"));
	closeMondayElement.click();
	
	WebElement searchTimeMonnndaycloseElement = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/div[1]/input[1]"));
	searchTimeMonnndaycloseElement.sendKeys("09:45 pm");
	actions.sendKeys(Keys.ENTER).build().perform();
	
	WebElement closeMondayElementtt = driver.findElement(By.xpath("//span[contains(text(),'09:45 pm')]"));
	validationn.checkText(closeMondayElementtt, "09:45 pm");
//	if(closeMondayElementtt.getText().equals("09:45 pm")){
//		System.out.println("Mayf chon dunng Close thứ  2 luc 09:45 tối roi do");
//	}
		Thread.sleep(4000);
		TearDown();
	}

}
