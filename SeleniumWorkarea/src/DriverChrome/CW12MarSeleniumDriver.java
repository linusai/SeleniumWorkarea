package DriverChrome;
//locators : 1.ID |2.Name|3.TagName|4.Class Name|5.LinkTest|6.Partial Link text|7.CSSSelector|xpath

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CW12MarSeleniumDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(); //Driver object created
		 driver.get("http://freecrm.co.in/");
		// driver.get("http://gmail.com");
		 driver.findElement(By.Xpath"///html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2])
		 driver.findElement(By.linkText("Sign in"));
		 System.out.println("signedin");
		driver.findElement(By.id("identifierId")).sendKeys("u.linusai@gmail.com");
		driver.findElement(By.id("identifierId.whsOnd.zHQkBf']")).sendKeys("u.linusai");
		driver.findElement(By.id("Log In")).click();
		//WebElement username=driver.findElement(By.id("E-mail address"));
		//username.sendKeys("u.linusai@gmail.com");
		
	}

}
