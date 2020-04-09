package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;
import pageobjects.LoginPageObjects;
import utility.MyException;

public class LoginPage extends BasePage implements LoginPageObjects  {

	
	
public LoginPage()
{
	super();
	
}

	
	
	public void userLogin(String username,String password) 
	{
		try {
		navigateToWebsite();
		
		type(userTxtField,username);
		type(passTxtField,password);
		snap.capture("loginpage");
	clickOn(loginBtn);
		
			
		} catch (IOException | MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
