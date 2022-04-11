package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RadData {
public static void main(String[] args) throws EncryptedDocumentException,IOException {
		
		FileInputStream path=new FileInputStream("C:\\Users\\Sonali\\OneDrive\\Desktop\\ApachePOI\\ExcelSheet1.xlsx");
		int value=WorkbookFactory.create(path).getSheet("Sheet1").getLastRowNum();
		System.out.println(value);
}
}


