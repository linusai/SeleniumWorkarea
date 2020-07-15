package DriverChrome;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelWriteLinks {

	static int linkCount = 0;
	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		List<String> element=new ArrayList<String>();
		for(WebElement links: driver.findElements(By.tagName("a"))) {
			System.out.println(links.getText());
			String LinkName = links.getText();
			if(LinkName != null && LinkName.length() > 0) {
			element.add(LinkName);
			}
			linkCount++;
		}
		System.out.println(element);
		int rowCount = 0;
		for(String LinkNames : element) {
			Row row = sheet.createRow(++rowCount);
			int columnCount = 0;
			Cell cell = row.createCell(++columnCount);             
			cell.setCellValue((String) LinkNames);
			FileOutputStream outputStream = new FileOutputStream("F:\\TestAutomation\\Testwrite.xlsx");
			workbook.write(outputStream);
		}

		//Closing the driver instance
		System.out.println("Total Links on Page : " + linkCount);
		driver.quit();
	}

}