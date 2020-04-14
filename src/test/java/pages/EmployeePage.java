package pages;

import java.io.IOException;

import base.BasePage;
import pageobjects.EmployeePageObjects;
import utility.MyException;

public class EmployeePage extends BasePage implements EmployeePageObjects {

	
	public void clickSaktiLogo() throws MyException, IOException
	{
		clickOn(saktiLogo);
		threadSleep();
		className=this.getClass().getSimpleName();
		snap.capture(className);
	}
	
	
}
