package pages;

import java.io.IOException;

import base.BasePage;
import pageobjects.MaintenancePageObjects;
import utility.MyException;

public class MaintenancePage extends BasePage implements MaintenancePageObjects{

	public MaintenancePage()
	{
		super();
	}
	
	public void navigateTopurgeRecords()
	{
		mouseOver(maintenanceLink);
		try {
			
		 mouseOver(purgeRecordsLink);
		
			clickOn(canditateRecordsLink);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void reverifyUser(String pass)
	{
		type(confirmPass,pass);
		try {
			className=this.getClass().getSimpleName();
			snap.capture(className);
			clickOn(verifyBtn);
			

		} catch (MyException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public LeaveListPage checkVacancy(String ename) 
	{try {
		type(vacancyTxt,"HR");
		pressEnter();
		
		clickOn(searchBtn);
		
			
			
			className=this.getClass().getSimpleName();
			snap.capture(className);
		} catch (IOException | MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return new LeaveListPage();
	}
}
