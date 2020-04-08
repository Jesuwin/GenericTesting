package pages;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import Entity.LoginEntity;
import base.BasePage;
import dataprovider.MyDataProvider;
import pageobjects.LoginPageObjects;
import utility.WebDriverFactory;

public class LoginPage extends BasePage implements LoginPageObjects{

	WebDriverFactory fac=WebDriverFactory.getInstance();
	WebDriver driver=fac.getDriver();
	
	
	public void userLogin()
	{
		
	MyDataProvider prov=new MyDataProvider();	
	List<LoginEntity> list=new LinkedList();
	
	list=prov.ReadDataFromCSV();
	
	
		
	}
	
}
