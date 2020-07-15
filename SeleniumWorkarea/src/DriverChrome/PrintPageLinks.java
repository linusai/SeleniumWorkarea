package DriverChrome;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PrintPageLinks {
	static int linkCount = 0;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(); //Driver object created
	  //   driver.get("http://freecrm.co.in/");
		driver.get("https://amazon.in/");
		// driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 6);
		//driver.findElement(By.id("multiplewindow")).click(); 
		 FileInputStream fis = new FileInputStream("F:\\TestAutomation\\Testwrite.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheetAt(2);
			 for (WebElement links: driver.findElements(By.tagName("a"))) {
			   System.out.println(links.getText());
			   linkCount++;
			   Row row = sheet.createRow(2);
				 Cell cell = row.createCell(0);
				 cell.setCellValue("No:of Link in the Amazon site is " + links.getText());
				// cell.setCellValue("No:of Link in the Amazon site is " + linkCount);
				 FileOutputStream fos = new FileOutputStream("F:\\TestAutomation\\Testwrite.xlsx");
				 workbook.write(fos);
				 fos.close();
				   	  }
					 
			 System.out.println("END OF WRITING DATA IN EXCEL");
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("F:\\TestAutomation\\Screenshot\\amazon.png"));
		  //Closing the driver instance
			System.out.println("Total Links on Page : " + linkCount);
         driver.quit();
	}

}
