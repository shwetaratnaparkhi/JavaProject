package filesExcels;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException 
	{
		System.out.println(System.getProperty("user.dir"));//
		
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData.xls");
		HSSFWorkbook wb= new HSSFWorkbook(file);
		HSSFSheet Sheet=wb.getSheet("Sheet1");//return type hssfsheet hence stored in hssfsheet sheet=
		HSSFRow row=Sheet.getRow(0);
		HSSFCell cell=row.getCell(0);
		
		System.out.println(cell.getStringCellValue());
		
		
		
	}

}
