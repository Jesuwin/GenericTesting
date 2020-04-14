package pages;

import java.io.IOException;

import base.BasePage;
import pageobjects.EportalLoginPageObjects;
import utility.MyException;

public class EportalLoginPage extends BasePage implements EportalLoginPageObjects{

	public EportalLoginPage()
	{
		super();
		
	}
	
	public EmployeePage LoginToEportal(String emp, String password) throws MyException, IOException
	{
		
		type(empid,emp);
		type(pass,password);
		className=this.getClass().getSimpleName();
		snap.capture(className);
		clickOn(loginBtn);
		
		return new EmployeePage();
	}
	
}
