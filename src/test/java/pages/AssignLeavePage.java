package pages;

import java.io.IOException;

import base.BasePage;
import pageobjects.AssignLeavePageObjects;
import utility.MyException;

public class AssignLeavePage extends BasePage implements AssignLeavePageObjects {

	public AssignLeavePage()
	{
		super();
	}
	
	public void fillAssignLeaveForm(String empname,String type,String fdate,String tdate,String dur,String comm)

	{	waitTillElementFound(empNameTxtField);
		type(empNameTxtField,empname);
		pressEnter();
		selectElementByVisibleText(leaveType,type);
		type(fromDate,fdate);
		type(toDate,tdate);
		selectElementByVisibleText(duration,dur);
		type(comment,comm);
		
		try {
			snap.capture("AssignLeaveForm");
		
			clickOn(assignBtn);
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
