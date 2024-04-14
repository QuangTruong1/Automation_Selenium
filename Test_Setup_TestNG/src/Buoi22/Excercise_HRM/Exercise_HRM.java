package Buoi22.Excercise_HRM;
// cuộn lên lại đầu trang: ->  js.executeScript("window.scrollTo(0, 0)");
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Exercise_HRM extends Init_khoitao_Exercise{
//	@Test
//	public void Demo1() throws Exception {
////		driver.get("https://codecanyon.net/item/hrm-human-resource-management/11309213");
////		
////		WebElement buttonLivePreviewElement = driver.findElement(By.xpath("//a[contains(text(),'Live Preview')]"));
////		Assert.assertEquals(buttonLivePreviewElement.getText(), "Live Preview");
////		buttonLivePreviewElement.click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String titleText = js.executeScript("return document.title;").toString();
////		System.out.println("Tieu de la: "+ titleText);
////		Assert.assertEquals(urlString, "https://hrm.froid.works/admin");
////		Thread.sleep(1000);
//		driver.get("https://hrm.froid.works/admin/dashboard");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
//		driver.findElement(By.xpath("//body/div[3]/form[1]/div[4]/button[1]/i[1]")).click();
//		
////		System.out.println(driver.findElement(By.className("btn btn-lg btn-block btn-success mt-4")).getText()); 
////		driver.findElement(By.xpath("/html[1]/body[1]")).click();
////		Assert.assertEquals(driver.getTitle(), "HRM - Dashboard");
//		
//		Thread.sleep(2000);
//	}
	public void FillinFormPersonal_Details() throws Exception {
		Actions actions = new Actions(driver);
		
		WebElement nameElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]"));
		WebElement FathernamElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]"));
		WebElement DateOfBirthElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]"));
		WebElement genderElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/select[1]"));
		WebElement phoneElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/input[1]"));
		WebElement LocalAddressElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/textarea[1]"));
		WebElement PermanentAddressElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[1]/textarea[1]"));
		WebElement EmailAccountElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/div[1]/input[1]"));
		WebElement PasswordAccountElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[10]/div[1]/input[2]"));
		
		
		nameElement.sendKeys("Quang Trường");
		FathernamElement.sendKeys("Văn Phước");
		actions.moveToElement(PasswordAccountElement).build().perform();
		Thread.sleep(1000);
		DateOfBirthElement.click();
		driver.findElement(By.xpath("//td[contains(text(),'14')]")).click();
		
		Select selectSimple = new Select(genderElement);
//		Assert.assertTrue(selectSimple.isMultiple());
		selectSimple.selectByVisibleText("Female");
		phoneElement.sendKeys("0842140812");
		LocalAddressElement.sendKeys("DaklAk");
		Thread.sleep(2000);
		PermanentAddressElement.sendKeys("Cũng ở Daklak");
		EmailAccountElement.sendKeys("uangtruongdz9009@gmail.com");
		PasswordAccountElement.sendKeys("Deptraikhongsai");
		
	}
	
	public void FillinFormCompany_Details() throws Exception {
		Actions actions = new Actions(driver);
		
		WebElement employeeIDElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		WebElement DepartmentElement = driver.findElement(By.xpath("//select[@id='department']"));
		WebElement designationElement = driver.findElement(By.xpath("//select[@id='designation']"));
		WebElement Date_of_JoiningElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]"));
		WebElement Joining_SalaryElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/input[1]"));
		
		employeeIDElement.sendKeys("2011068764");
		Select selectSimple = new Select(DepartmentElement);
		Assert.assertTrue(!selectSimple.isMultiple());
		selectSimple.selectByVisibleText("Data Collection");
		Assert.assertEquals(selectSimple.getFirstSelectedOption().getText(), "Data Collection");
		Select selectSimple2 = new Select(designationElement);
		Assert.assertTrue(!selectSimple2.isMultiple());
		selectSimple2.selectByVisibleText("Surveyor");
		Assert.assertEquals(selectSimple2.getFirstSelectedOption().getText(), "Surveyor");
		
		Date_of_JoiningElement.click();
		driver.findElement(By.xpath("//td[contains(text(),'21')]")).click();
		Joining_SalaryElement.sendKeys("10000");
		
		WebElement buttonSubmitElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		
		buttonSubmitElement.click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/p[2]/a[1]")).click();
		WebElement buttonndeleteeElement = driver.findElement(By.xpath("//button[@id='delete']"));
		buttonndeleteeElement.click();
//		driver.switchTo().alert().accept();
		
	}
	
	public void SearchAfterAdd() {
		WebElement textboxSearchElement = driver.findElement(By.xpath("//input[@type='search']"));
		textboxSearchElement.sendKeys("Quang Trường");		
	}
	
	@Test(priority = 0)
	public void AddEmployee() throws Exception {
		InitKhoiTao();
		WebElement buttonaddnewemployElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]"));
		Assert.assertTrue(buttonaddnewemployElement.isEnabled());
		buttonaddnewemployElement.click();
		FillinFormPersonal_Details();
		FillinFormCompany_Details();
		SearchAfterAdd();
		Thread.sleep(2000);
	}
	
	public void edit_Personal_Details() throws Exception {
		WebElement editNameElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]"));
		WebElement editFather_NameElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/input[1]"));
		WebElement editDate_of_BirthElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]"));
		WebElement editGenderElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/select[1]"));
		WebElement editPhoneElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/input[1]"));
		WebElement editAddressElement = driver.findElement(By.xpath("//textarea[@name='localAddress']"));
		WebElement editPermanent_AddressElement = driver.findElement(By.xpath("//textarea[@name='permanentAddress']"));
		WebElement editEmailElement = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement editPasswordElement = driver.findElement(By.xpath("//input[@name='new_password']"));
		
		editNameElement.clear();
		editNameElement.sendKeys("Nguyễn Nhật Hạ");
		editFather_NameElement.clear();
		editFather_NameElement.sendKeys("Nguyễn Quang Hằn");
		Assert.assertTrue(editDate_of_BirthElement.isEnabled());
		editDate_of_BirthElement.click();
		driver.findElement(By.xpath("//td[contains(text(),'30')]")).click();
		Actions actions = new Actions(driver);
		actions.moveToElement(editPermanent_AddressElement).build().perform();
		editGenderElement.click();
		Select selectGender = new Select(editGenderElement); 
		selectGender.selectByVisibleText("Female");
		editPhoneElement.clear();
		editPhoneElement.sendKeys("0811122412");
		editAddressElement.clear();
		editAddressElement.sendKeys("Ở Sài Gòn nè");
		editPermanent_AddressElement.clear();
		editPermanent_AddressElement.sendKeys("Thủ Đức");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		editEmailElement.clear();
		editEmailElement.sendKeys("Nguyenhadepgai@gmail.com");
		editPasswordElement.clear();
		editPasswordElement.sendKeys("Nguyenhadepgai@gmail.com");
		
		WebElement titlElement = driver.findElement(By.xpath("//body/div[1]"));
		actions.moveToElement(titlElement);
		js.executeScript("window.scrollTo(0, 0)");
		
		WebElement button_save_Personal_Details = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/a[1]"));
		Assert.assertTrue(button_save_Personal_Details.isEnabled());
		button_save_Personal_Details.click();
	}
	
	
	public void edit_Company_Details() throws Exception {
		WebElement editEmployee_IDElement = driver.findElement(By.xpath("//input[@name='employeeID']"));
		WebElement editDepartmentElement = driver.findElement(By.xpath("//select[@id='department']"));
		WebElement editDesignationElement = driver.findElement(By.xpath("//select[@id='designation']"));
		WebElement editjoiningDateElement = driver.findElement(By.xpath("//input[@name='joiningDate']"));
		WebElement editexit_dateElement = driver.findElement(By.xpath("//input[@name='exit_date']"));
		WebElement editStatusActiveElement = driver.findElement(By.xpath("//span[@class='bootstrap-switch-handle-on bootstrap-switch-success']"));
		WebElement editInActiveElement = driver.findElement(By.xpath("//span[@class='bootstrap-switch-handle-off bootstrap-switch-danger']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Assert.assertFalse(editEmployee_IDElement.isEnabled());
		Thread.sleep(1000);
		Select selectDeparment = new Select(editDepartmentElement);
		selectDeparment.selectByVisibleText("Data Collection");
		Assert.assertEquals(selectDeparment.getFirstSelectedOption().getText(),"Data Collection");
		Select selectDesignation = new Select(editDesignationElement);
		selectDesignation.selectByVisibleText("Surveyor");
		Assert.assertEquals(selectDesignation.getFirstSelectedOption().getText(),"Surveyor");
		editjoiningDateElement.click();
		driver.findElement(By.xpath("//td[@class='day'][normalize-space()='27']")).click();
//		System.out.println(editjoiningDateElement.getText());
		Assert.assertTrue(editStatusActiveElement.isDisplayed());
		js.executeScript("window.scrollTo(0, 0)");
		WebElement buttonsaveCompanyDetails = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/a[1]"));
		Assert.assertTrue(buttonsaveCompanyDetails.isEnabled());
		buttonsaveCompanyDetails.click();
		
	}
	@Test(priority = 1)
	public void EditEmployee() throws Exception {
		InitKhoiTao();
		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/p[1]/a[1]")).click();
		edit_Personal_Details();
		edit_Company_Details();
		Thread.sleep(4000);
	}
	
	public void Fillin_AddAdmin_Form() {
		driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Quang Trung");
		driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("QuangTrung@gmail.com");
		driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("QuangTrung@gmail.com");
		WebElement buttonSubmitElement = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		Assert.assertTrue(buttonSubmitElement.isEnabled());
		buttonSubmitElement.click();
	}
	@Test(priority = 2)
	public void AddAdmin() throws Exception {
		InitKhoiTao();
		WebElement textlinkAdminElement = driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
		Assert.assertTrue(textlinkAdminElement.isEnabled());
		textlinkAdminElement.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String titleaddEmployee = js.executeScript("return document.title;").toString();
		Assert.assertEquals(titleaddEmployee, "HRM - Admin");
		driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[2]/div[1]/a[1]")).click();
		String titleNewAdmin = js.executeScript("return document.URL;").toString();
		Assert.assertEquals(titleNewAdmin, "https://hrm.froid.works/admin/admin/create");
		Fillin_AddAdmin_Form();
		Thread.sleep(2000);
	}
}
