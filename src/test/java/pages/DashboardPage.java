package pages;

import java.io.IOException;

import base.BasePage;
import pageobjects.DashBoardPageObjects;
import utility.MyException;

public class DashboardPage extends BasePage implements DashBoardPageObjects {

	public DashboardPage()  {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AssignLeavePage clickAssignLeave()
	{try {
		waitTillElementFound(assignLeaveLink);
		className=this.getClass().getSimpleName();
		snap.capture(className);
			clickOn(assignLeaveLink);
			
			
			
			
			
			
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new AssignLeavePage();
	}
	
	public void navigateToDashBoard()
	{
		try {
			clickOn(dashboardLink);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void navigateToTimeSheets()
	{
		try {
			clickOn(timesheetLink);
			threadSleep();
		} catch (MyException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getTimeSheetforEmp(String empname)
	{
		clear(empnameBox);
		try {
			threadSleep();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		type(empnameBox,empname);
		className=this.getClass().getSimpleName();
		try {
			snap.capture(className);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			clickOn(viewBtn);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public void logoutFromHRM()
{
	try {
		clickOn(adminLink);
		threadSleep();
		clickOn(logoutLink);
	} catch (MyException | InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
