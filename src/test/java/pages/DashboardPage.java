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
		snap.capture("dashboard");
			clickOn(assignLeaveLink);
			
			
			
			
			
			
		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return new AssignLeavePage();
	}
	

	
}
