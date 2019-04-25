package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
//	public static String excelFilePath;
//	//= "C:\\Users\\Daniel - new\\Desktop\\Access_Creds.xlsx";
//	public static String sheetName;
	//= "Sheet1";
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
//	static String systemPath = System.getProperty("user.dir");
		
	public Excel(String excelPath, String sheetName) {
			
		try {
			
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	
	
	public static int getRowCount() {
		
		int rowCount = 0;

		try {
			
			rowCount = sheet.getPhysicalNumberOfRows();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		return rowCount;
		
	}
	
	public static int getColumnCount() {
		
		int columnCount = 0;

		try {
			
			columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		return columnCount;
		
	}

	public String getStringCellData(int rowNumber, int colNumber) {
		
		String cellData = null;

		try {
			
			cellData = sheet.getRow(rowNumber).getCell(colNumber).getStringCellValue();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		return cellData;
		
	}
	
	
	public static double getDoubleCellData(int rowNumber, int colNumber) {
		
		double cellData = 0;

		try {
			
			cellData = sheet.getRow(rowNumber).getCell(colNumber).getNumericCellValue();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		return cellData;
		
	}
	
}
