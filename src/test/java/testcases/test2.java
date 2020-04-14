package testcases;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import base.BasePage;
import dataprovider.MyDataProvider;
import pages.AssignLeavePage;
import pages.EportalLoginPage;
import pages.LoginPage;
import utility.MyException;

public class test2 extends Base {
	
	
	
	
	@BeforeMethod
	public void setup()
	{
		
		eportallogin=new EportalLoginPage();
		
	}
	@Test
	public void EportalLoginPageTest() 
	{
	try {
		emppage=eportallogin.LoginToEportal("23477","123Jesuwinisawesome*");
	} catch (MyException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}

	@Test(dependsOnMethods="EportalLoginPageTest")
	public void navigateToSakthi()
	{
	 try {
		emppage.clickSaktiLogo();
	} catch (MyException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	
	
	}
