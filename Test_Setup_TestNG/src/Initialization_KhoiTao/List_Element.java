package Initialization_KhoiTao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class List_Element extends Init{
	public static WebElement buttonSigninElement = driver.findElement(By.xpath("//a[@id='btn-login']"));
	public static WebElement textUsernameElement = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	public static WebElement textPassWordElement = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
	public static WebElement buttonLoginElement = driver.findElement(By.xpath("//button[@id='login']"));
}
