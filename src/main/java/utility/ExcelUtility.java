package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import config.ConfigProperties;

public class ExcelUtility {

	Workbook book=null;
	Row row=null;
	FileInputStream inputStream=null;
	File file =   null;
	
	ConfigProperties prop=new ConfigProperties();

	
	//Initalise workbook
	
	public Workbook initWorkbook() throws MyException
	{
		try {
		file=new File(prop.fetchPropertyFromFile("dataExcelFileName"));
		inputStream = new FileInputStream(file);
		book= getAppropriateWorkBook(inputStream);
		
		}
	catch(FileNotFoundException e)
		{
		throw new MyException("Unable to load Excel File.");
		}
		
		return book;
	}
	
	//Tear down
	public void tearDown()
	{
		try {
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//check if the fileExtension is xlsx or xls
	
	private Workbook  getAppropriateWorkBook(FileInputStream is)
	{
		Workbook book1=null;
		String fileName=prop.fetchPropertyFromFile("dataExcelFileName");
		String fileExtensionName=fileName.substring(fileName.indexOf("."));
		
		if(fileExtensionName.equals(".xlsx"))
		{
			book1=new XSSFWorkbook(is);
		}
		else if(fileExtensionName.equals(".xls"))
		{
			book1=new HSSFWorkbook(is);
		}
		
		return book1; 
	}
	
	//Get Sheet by name
	
	public Sheet getSheet(Workbook book)
	{
		try {
			Sheet newSheet=book.getSheet(prop.fetchPropertyFromFile("sheetname"));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	//Write operations into Excel
	
	public void writeIntoExcel(Workbook book, File file)
	{
		FileOutputStream opStream=null;
		try {
			opStream=new FileOutputStream(file);
			
				book.write(opStream);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	}
	
	
	

