package pages;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import Entity.LoginEntity;
import base.BasePage;
import dataprovider.MyDataProvider;
import pageobjects.LoginPageObjects;
import utility.MyException;
import utility.WebDriverFactory;

public class LoginPage extends BasePage implements LoginPageObjects{

	public LoginPage(WebDriver driver) throws MyException {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	WebDriverFactory fac=WebDriverFactory.getInstance();
	WebDriver driver=fac.getDriver();
	
	
	public DashboardPage userLogin() throws MyException
	{
		try {
		
	
	
	
		
	} catch (MyException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return new DashboardPage(driver);
		
	}
	
}
