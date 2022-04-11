package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import SeleniumConfiguration.Configuration;

public class SignUpExcel {
public static void main(String[] args) throws EncryptedDocumentException,IOException {
		
		//Read excelsheet data
		
		FileInputStream path=new FileInputStream(Configuration.Excelpath);
		
		Workbook wk=WorkbookFactory.create(path);
		
		String Firstname=wk.getSheet("Sheet3").getRow(1).getCell(0).getStringCellValue();
		System.out.println(Firstname);

		
		String Lastname=wk.getSheet("Sheet3").getRow(1).getCell(1).getStringCellValue();
		System.out.println(Lastname);

		String Email=wk.getSheet("Sheet3").getRow(1).getCell(2).getStringCellValue();
		System.out.println(Email);
		String ConfirmEmail=wk.getSheet("Sheet3").getRow(1).getCell(3).getStringCellValue();
		System.out.println(ConfirmEmail);
		String Password=wk.getSheet("Sheet3").getRow(1).getCell(4).getStringCellValue();
		System.out.println(Password);
		
		String day=wk.getSheet("Sheet3").getRow(1).getCell(5).getStringCellValue();
		System.out.println(day);
		String month=wk.getSheet("Sheet3").getRow(1).getCell(6).getStringCellValue();
		System.out.println(month);
		String year=wk.getSheet("Sheet3").getRow(1).getCell(7).getStringCellValue();
		System.out.println(year);
		String Gender=wk.getSheet("Sheet3").getRow(1).getCell(8).getStringCellValue();
		System.out.println(Gender);
		
		//Browser launch
		System.setProperty("webdriver.chrome.driver",Configuration.driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get(Configuration.appUrlSignup);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Lastname);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(ConfirmEmail);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
		
		WebElement day1=driver.findElement(By.xpath("//select[@id='day']"));
		Select sel=new Select(day1);
		sel.selectByVisibleText(day);
	
		WebElement month1=driver.findElement(By.xpath("//select[@id='month']")); 
		Select sel1=new Select(month1);
		sel1.selectByVisibleText(month); 
		
		WebElement year1=driver.findElement(By.xpath("//select[@id='year']")); 
		Select sel2=new Select(year1);
		sel2.selectByVisibleText(year);
		driver.findElement(By.xpath("//input[@value='1']")).click(); 
		


	}

}
