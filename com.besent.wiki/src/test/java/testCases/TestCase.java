package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase {
	
	@Test
	public void launchApplication() {
		WebDriver driver = new ChromeDriver();
	}

}
