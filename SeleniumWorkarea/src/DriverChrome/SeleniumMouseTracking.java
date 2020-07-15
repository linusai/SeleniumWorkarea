package DriverChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMouseTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
         String baseUrl ="http://www.artoftesting.com/samplesiteforselenium";
         //Mouseover on submit button
         Actions action = new Actions(driver);
         WebElement btn = driver.findElement(By.id("idOfButton"));
         action.moveToElement(btn).perform();
          
         //Thread.sleep just for user to notice the event
         //Thread.sleep(3000);
          
         //Closing the driver instance
         driver.quit();
         

	}

}
