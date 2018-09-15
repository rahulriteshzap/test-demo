import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData_Excel 
{
	public static String getDataFromExcel(String filepath, String sheetName, int rowIndex, int cellIndex)
	{
		String Data = null;
		
		try
		{
			File f = new File (filepath);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowIndex);
			Cell c = r.getCell(cellIndex);
			Data = c.toString();
					
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return Data;
	}

}
