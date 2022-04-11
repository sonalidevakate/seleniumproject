package POM;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import SeleniumConfiguration.Configuration;

public class UtilityReadExcel {

	public String readExcelData(int row, int col) throws EncryptedDocumentException, IOException {
		
		FileInputStream ff = new FileInputStream (Configuration.Excelpath); 
		
		//Read excel sheet data
		
		Workbook wk=WorkbookFactory.create(ff);
		//read value and store it into variable
		String read=wk.getSheet("Sheet3").getRow(row).getCell(col).getStringCellValue();
		
		return read;
		
	
	}

}





