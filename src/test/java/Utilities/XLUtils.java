package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class XLUtils {

	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook wb;
	public Sheet sheet;
	public Row row;
	public Cell cell;
	String path;
public Map<String,  Integer>colnum=new HashMap<>();
	public XLUtils(String path) {
		this.path = path;
	}	
	public int getRowCount(String xlsheetname) throws IOException {
		fi = new FileInputStream(path);
		System.out.println(fi);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlsheetname);
		int rowcount = sheet.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	public int getCellCount(String xlsheetname, int rownum) throws IOException {
		fi = new FileInputStream(path);
		Workbook wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlsheetname);
		row = sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}

	public String getCellData(String xlsheetname, int rownum, int colnum) throws IOException {
		fi = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlsheetname);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);

		DataFormatter formatter = new DataFormatter();
		String data;
		try {

			data = formatter.formatCellValue(cell);

		} catch (Exception e) {
			data = "";
		}
		wb.close();
		fi.close();
		return data;
	}
	
	
//	public String getCellData(String xlsheetname, int rownum, int colnum,String Reqcol_data) throws IOException {
//		FileInputStream inputStream = new FileInputStream(new File(
//				"D:\\Manoj Files\\Rock_Automation_Scripts\\UIAmutual\\src\\test\\java\\TestData\\UIA_TestData_New_excel_colunm.xls"));
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//		XSSFSheet sheet = workbook.getSheet(xlsheetname);
//		int rowCount = sheet.getPhysicalNumberOfRows();
//		XSSFCell firstColumnCell = null;
//		int firstColumnRowCount = 0;
//		for (int i = 0; i <= rowCount; i++) {
//			try {
//				XSSFRow row = sheet.getRow(i);
//				firstColumnCell = row.getCell(0);
//
//			} catch (NullPointerException nullPointerException) {
//				System.out.println("Cell is null at index: " + i);
//			}
//			if (firstColumnCell != null) {
//
//				if (firstColumnCell.getStringCellValue().length() > 0) {
//					firstColumnRowCount = i;
//				}
//			}
//		}
//		// first col total rows count
//		for (int j = 0; j <= firstColumnRowCount; j++) {
//
//			XSSFRow row = sheet.getRow(j);
//			XSSFCell cell = row.getCell(0);
//
//			// String excel_value= cell.getStringCellValue();
//			System.out.println(cell.getStringCellValue());
//
//			if (cell.getStringCellValue().equals(Reqcol_data)) {
//				System.out.println("TestcaseID equals to expected ID - Execution Started");
//				
//				TC_6998 tc=new TC_6998();
//				
//				break;
//			}
//			
//		}
//
//		workbook.close();
//		return xlsheetname;
//	}
//		

	public void setCellData(String xlsheet, int rownum, int colnum, String data) throws IOException {
		fi = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		cell = row.createCell(colnum);
		cell.setCellValue(data);

		fo = new FileOutputStream(path);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();

	}

}
