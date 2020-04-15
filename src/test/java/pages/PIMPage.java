package pages;

import java.awt.AWTException;
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
	{try {
		waitTillElementFound(empname);
		System.out.println("wait over");
		threadSleep();
		type(empname,name);
		pressEnter();
		
			clickOn(searchBtn);
			className=this.getClass().getSimpleName();
			snap.capture(className);
		} catch (MyException | IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addNewEmployee(String fname,String mname,String lname,String eid)
	{
		String filepath;
		try {
			filepath = prop.fetchPropertyFromFile("samplePhoto");
		
		clickOn(addEmpLink);
		type(firstNameTxt,fname);
		type(middleNameTxt,mname);
		type(lastNameTxt,lname);
		clear(newEmpId);
		type(newEmpId,eid);
		threadSleep();
		
			uploadFile(photoBtn, filepath);
			className=this.getClass().getSimpleName().concat("addEmployee");
			snap.capture(className);
		}
		 catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
	
}}
