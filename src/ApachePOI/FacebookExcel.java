package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumConfiguration.Configuration;

public class FacebookExcel {
	public static void main(String[] args) throws EncryptedDocumentException,IOException {
		
		//Read excelsheet data
		
		FileInputStream path=new FileInputStream("C:\\Users\\Sonali\\OneDrive\\Desktop\\ApachePOI\\ExcelSheet1.xlsx");
		
		Workbook wk=WorkbookFactory.create(path);
		
		String username=wk.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);

		String password=wk.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		System.out.println(password);
		
		//Browser launch
		System.setProperty("webdriver.chrome.driver",Configuration.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(Configuration.appUrlFLogin);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username); 
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);


	}
}
