package TestNGProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import SeleniumConfiguration.Configuration;

	public class UtilityClass {
	public String readExcelData(int row, int col) throws EncryptedDocumentException,IOException	{
		
		
		FileInputStream ff=new FileInputStream(Configuration.Excelpath);
		
		Workbook wk =WorkbookFactory.create(ff);
		
		String data = wk.getSheet("sheet3").getRow(row).getCell(col).getStringCellValue();
		
		return data;
}


}
