package POM;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import SeleniumConfiguration.Configuration;

public class ExcelTestCaseRun {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver",Configuration.driverpath);
			WebDriver driver = new ChromeDriver();		
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
			PomExcel pm = new PomExcel(driver);
			UtilityReadExcel util = new UtilityReadExcel();
			
			//Testcase-01
			pm.enterFirstName(util.readExcelData(1, 0));
			pm.enterLastName(util.readExcelData(1, 1));
			pm.enterEmail(util.readExcelData(1, 2));
			pm.ConfirmEmail(util.readExcelData(1, 3));
			pm.enterNewPassword(util.readExcelData(1, 4));
			pm.selectDay(util.readExcelData(1, 5));
			pm.selectMonth(util.readExcelData(1, 6));
			pm.selectYear(util.readExcelData(1, 7));
			pm.clickOnRadio();
		
			//Date & Time
			Date d=new Date();
			String s=d.toString();
			String str=s.replace(":", "-");
			
			//Screenshot
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File f=new File(Configuration.screenshotpath +str+ ".jpg");
			FileHandler.copy(src, f);
			
			
			//Thread.sleep(2000);
			//driver.navigate().refresh();
			
			//Testcase-02
			pm.enterFirstName(util.readExcelData(2, 0));
			pm.enterLastName(util.readExcelData(2, 1));
			pm.enterEmail(util.readExcelData(2, 2));
			pm.ConfirmEmail(util.readExcelData(2, 3));
			pm.enterNewPassword(util.readExcelData(2, 4));
			pm.selectDay(util.readExcelData(2, 5));
			pm.selectMonth(util.readExcelData(2, 6));
			pm.selectYear(util.readExcelData(2, 7));
			pm.clickOnRadio2();
			//Thread.sleep(2000);
			//driver.navigate().refresh();
}
}
			
			
			