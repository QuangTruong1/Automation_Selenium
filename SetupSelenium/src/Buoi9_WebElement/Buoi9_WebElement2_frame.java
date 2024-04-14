package Buoi9_WebElement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buoi9_WebElement2_frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\PhanMem\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// 1 - Maximize browser của mình
		driver.manage().window().maximize();

		// 2 - Đi đến 1 url

		driver.navigate().to("https://testpages.eviltester.com/styled/frames/frames-test.html");
		
//		Chuyển đến khung Frame(giữa) để bắt được element bên trong Frame, Nếu code nằm trong Frame thì ta k lấy được chính xác Xpath
//		hoặc 			IFrame 
		driver.switchTo().frame("middle");
		
		System.out.println(driver.findElement(By.xpath("//li[@id='middle0']")).getText());
		Thread.sleep(3000);	
		System.out.println("Chạy xong chương trình!!");
		driver.quit();
	}

}
