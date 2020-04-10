package dataprovider;

import org.testng.annotations.DataProvider;

import base.Base;
import config.ConfigProperties;
import utility.ExcelUtility;
import utility.MyException;


public class MyDataProvider extends Base{

	
	ConfigProperties prop=null;
	Object[][] obj=null;
	@DataProvider
	public Object[][] Authentication() 
	{
		
		prop=new ConfigProperties();
		
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
	
	@DataProvider
	public Object[][] AssignLeaveProvider()
	{
prop=new ConfigProperties();
		
		try {
			ExcelUtility.setExcelFile(prop.fetchPropertyFromFile("dataExcelFileName"), "assignleave");
			
		
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
