package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelClass 
{
	public static String getData(String sheet,int row,int column) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream ("./Excel workbook/WeekendData.xlsx");
		Workbook book =WorkbookFactory.create(fis);
		Sheet s= book.getSheet(sheet);
		Row r=s.getRow(row);
		Cell c = r.getCell(column);
		String val;
		return val=c.getStringCellValue();
	}

}
