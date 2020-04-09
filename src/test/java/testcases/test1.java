package testcases;

import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BasePage;
import dataprovider.MyDataProvider;
import pages.LoginPage;

public class test1  {
	
	BasePage page;
	LoginPage login;
	
	
	@BeforeMethod
	public void setup()
	{
		page=new BasePage();
		login=new LoginPage();
		
	}
	
	
	
	
	@Test(dataProvider="Authentication", dataProviderClass = MyDataProvider.class)
	public void loginTest(Map<Object, Object> map)
	{
		String username=(String) map.get("uname");
		String password=(String) map.get("pass");
		
	login.userLogin(username, password);
		
	}

	
	
	}
