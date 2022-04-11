package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet2 {
	public static void main(String[] args) throws EncryptedDocumentException,IOException {
		
		FileInputStream path=new FileInputStream("C:\\Users\\Sonali\\OneDrive\\Desktop\\ApachePOI\\ExcelSheet1.xlsx");
		double readData=WorkbookFactory.create(path).getSheet("Sheet2").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(readData);
}
}