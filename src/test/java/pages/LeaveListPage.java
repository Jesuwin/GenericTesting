package pages;

import java.io.IOException;

import base.BasePage;
import pageobjects.LeaveListPageObjects;
import utility.MyException;

public class LeaveListPage extends BasePage implements LeaveListPageObjects {

	public LeaveListPage()
	{
		super();
	}
	
	public void goTousageLink()
	{
		
		mouseOver(leaveLink);
		mouseOver(reportsLink);
		try {
			clickOn(usageLink);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void generateReportsForEmp(String gFor, String emp)
	{
		selectElementByVisibleText(generateDropDown, gFor);
		
		try {
			threadSleep();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		type(empBox,emp);
		pressEnter();
		try {
			threadSleep();
			className=this.getClass().getSimpleName();
			snap.capture(className);
			clickOn(viewBtn);
		} catch (MyException | InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
}
