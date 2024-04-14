package ObjectLoginpage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object {
	WebDriver driver = new ChromeDriver();
	public WebElement button_login = driver.findElement(By.id("btn-login"));
	public WebElement button_login1 = driver.findElement(By.id("login"));
	public WebElement button_login2 = driver.findElement(By.id("btn-login"));
	public WebElement button_login3 = driver.findElement(By.id("btn-login"));
}
