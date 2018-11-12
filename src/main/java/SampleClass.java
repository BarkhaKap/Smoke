import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import freemarker.template.utility.RichObjectWrapper;




public class SampleClass {

	
	
	
	
	public static Workbook fn_getWorkbook(String file) throws IOException{
		
		Workbook wb;
		
		
		FileInputStream fis=new FileInputStream(file);
		if(file.endsWith("xlsx")){
			wb=new XSSFWorkbook(fis);
		}else{
	      wb=new HSSFWorkbook(fis);
		}
		return wb;
	}
	
	
	
	public static int fn_getRowNum(String testCaseId,Sheet sheet){
		int row1=0;
		
		int num=sheet.getLastRowNum();
		for(int i=0;i<num;i++){
			Row row=sheet.getRow(i);
			String rowvalue=row.getCell(0).getStringCellValue();
			if(rowvalue.equalsIgnoreCase(testCaseId)){
				row1=i;
				break;
			}
		}
		return row1;
		
	}
	
	
	public static int fn_getCellNum(String colName,Sheet sheetName){
		int j=0;
		
		Row row=sheetName.getRow(0);
		int cellNum=row.getLastCellNum()-1;
		for(int i=0;i<cellNum;i++){
			String colNam=row.getCell(i,row.CREATE_NULL_AS_BLANK).getStringCellValue();
			if(colNam.equalsIgnoreCase(colName)){
				j=i;
				break;
			}
		}
		return j;
		
		
	}
	
	
	
	
	
	public String fn_getCellData(String file,String sheet,String row,String colm) throws IOException{
		
	
		
	    Workbook wb= fn_getWorkbook(file);
	    Sheet sheetobj=wb.getSheet(sheet);
	    int j=fn_getRowNum(row, sheetobj);
	    int k=fn_getCellNum(colm, sheetobj);
	    String data=sheetobj.getRow(j).getCell(k).getStringCellValue();
	    return data;
	    
	    
	}
	
	
}
