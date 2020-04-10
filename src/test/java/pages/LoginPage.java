package pages;

import java.io.IOException;

import base.BasePage;
import pageobjects.LoginPageObjects;
import utility.MyException;

public class LoginPage extends BasePage implements LoginPageObjects  {

	
	
public LoginPage()
{
	super();
	
}

	
	
	public DashboardPage userLogin(String username,String password)
	{
		try {
		
			navigateToWebsite();
			waitTillElementFound(userTxtField);
		type(userTxtField,username);
		type(passTxtField,password);
		className=this.getClass().getSimpleName();
		snap.capture(className);
	clickOn(loginBtn);
		
			
		} catch (IOException | MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new DashboardPage();
		
		
	}
	
}
