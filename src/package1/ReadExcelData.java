package package1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	XSSFWorkbook wb;	
	XSSFSheet Sheet1;
	
public ReadExcelData(String Path){

File src= new File(Path);	
try {
	FileInputStream fis=new FileInputStream(src);
	wb=new XSSFWorkbook(fis);
} catch (Exception e) {
	System.out.println(e.getMessage());
}		 
}
public String getData(int Sheet	, int row, int column){
	Sheet1=wb.getSheetAt(Sheet);
	String Data=Sheet1.getRow(row).getCell(column).getStringCellValue();
	return Data;	
	
}	
	
}
