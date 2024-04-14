package Buoi16.exercise_testng;

import org.openqa.selenium.WebElement;

public class Validationn {
	public void checkText(WebElement element, String textValue) {
		if(element.getText().equals(textValue)) {
			System.out.println(element.getText() + " Choose success");
		}else {
			System.out.println(element.getText() + " Choose not success");
		}
	}
}
