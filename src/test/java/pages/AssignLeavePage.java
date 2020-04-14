package pages;

import java.awt.event.KeyEvent;
import java.io.IOException;

import base.BasePage;
import pageobjects.AssignLeavePageObjects;
import utility.MyException;

public class AssignLeavePage extends BasePage implements AssignLeavePageObjects {

	boolean res;
	public AssignLeavePage()
	{
		super();
	}
	
	public PIMPage fillAssignLeaveForm(String empname,String type,String fdate,String tdate,String dur,String comm, String parDay)

	{	waitTillElementFound(empNameTxtField);
		type(empNameTxtField,empname);
		pressEnter();
		selectElementByVisibleText(leaveType,type);
		clear(fromDate);
		threadSleep();
		type(fromDate,fdate);
		threadSleep();
		clear(toDate);
		threadSleep();
		type(toDate,tdate);
		rob.keyPress(KeyEvent.VK_ENTER);
		waitTillElementFound(partialDay);
		selectElementByVisibleText(partialDay,parDay);
		selectElementByVisibleText(duration,dur);
		type(comment,comm);
		threadSleep();
		className=this.getClass().getSimpleName();
		/*
		 * try {
		 * 
		 * 
		 * clickOn(assignBtn); 
		 * res=checkElementVisible(popupOkayBtn); 
		 * if(res==true) {
		 * clickOn(popupOkayBtn);
		 *  }
		 */
			try {
				snap.capture(className);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new PIMPage();
		} 

		
		
		
	}


