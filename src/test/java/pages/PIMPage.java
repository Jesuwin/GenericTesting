package pages;

import java.io.IOException;

import base.BasePage;
import pageobjects.PIMPageObjects;
import utility.MyException;

public class PIMPage extends BasePage implements PIMPageObjects {

	public PIMPage()
	{
		super();
	}
	
	public void navigateToPIMModule()
	{
		mouseOver(pimLink);
		try {
			waitTillElementFound(empList);
		 
		
			clickOn(empList);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void findEmpDetail(String name)
	{
		type(empname,name);
		pressEnter();
		try {
			clickOn(searchBtn);
			className=this.getClass().getSimpleName();
			snap.capture(className);
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
