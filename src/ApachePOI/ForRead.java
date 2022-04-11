package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ForRead {
	public static void main(String[] args) throws EncryptedDocumentException,IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Sonali\\OneDrive\\Desktop\\ApachePOI\\ExcelSheet1.xlsx");
		Sheet sht=WorkbookFactory.create(path).getSheet("Sheet1");
		for(int i=0;i<=5;i++) {

			for(int j=0;j<=4;j++) {

		String data=sht.getRow(i).getCell(j).getStringCellValue();
		System.out.println(data);
}
	}
}
}