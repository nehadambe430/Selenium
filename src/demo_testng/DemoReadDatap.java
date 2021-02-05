package demo_testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoReadDatap 
{
	@DataProvider
	public static String[][] demo() throws EncryptedDocumentException, IOException
	{
		String[][] str;
		FileInputStream fis=new FileInputStream("D:\\Login.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet=book.getSheet("login");
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		Row firstrow=sheet.getRow(0);
		str=new String[rowcount-1][firstrow.getLastCellNum()];
		
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<firstrow.getLastCellNum();j++)
			{
				str[i-1][j]=sheet.getRow(i).getCell(j).toString();
				
			}
		}
		
		return str;
		
		
		
	}
	
	@Test(dataProvider="demo")
	public void tc(String user,String pass)
	{
		Reporter.log(user+" "+pass,true);
	}

}
