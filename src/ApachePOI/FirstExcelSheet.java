package ApachePOI;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FirstExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException,IOException {
	for(int i=0;i<=5;i++) {
	FileInputStream path=new FileInputStream("C:\\Users\\Sonali\\OneDrive\\Desktop\\ApachePOI\\ExcelSheet1.xlsx");
	String readData=WorkbookFactory.create(path).getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
	System.out.println(readData);
}
}
}
