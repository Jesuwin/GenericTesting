package dataprovider;

import org.testng.annotations.DataProvider;

import config.ConfigProperties;
import utility.ExcelUtility;
import utility.MyException;


public class MyDataProvider {

	ExcelUtility util=null;
	ConfigProperties prop=null;
	@DataProvider
	public Object[][] Authentication() 
	{
		Object[][] obj=null;
		prop=new ConfigProperties();
		util=new ExcelUtility();
		try {
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "logindetails");
			
		
		obj=ExcelUtility.getTableArray();
		
		
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
		
	}
	
	
}
