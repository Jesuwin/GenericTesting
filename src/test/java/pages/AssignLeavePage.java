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

	{	//waitTillElementFound(empNameTxtField);
		
		try {
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
		threadSleep();
		selectElementByVisibleText(partialDay,parDay);
		//selectElementByVisibleText(duration,dur);
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
			
				snap.capture(className);
			} catch (InterruptedException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return new PIMPage();
		} 

		
		
		
	}


