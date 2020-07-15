package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By LoginLink = By.xpath("//*[@id=pt-login]/a)");
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void clickLoginLink() {
		driver.findElement(LoginLink).click();
		
	}
}
