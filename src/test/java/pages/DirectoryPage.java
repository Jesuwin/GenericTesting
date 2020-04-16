package pages;

import java.io.IOException;

import base.BasePage;
import pageobjects.DirectoryPageObjects;
import utility.MyException;

public class DirectoryPage extends BasePage implements DirectoryPageObjects{
	
	public DirectoryPage()
	{
		super();
	}
	
	public MaintenancePage searchDirectory(String empname)
	{try {

		clickOn(directorylink);
		type(searchName,empname);
		clickOn(searchBtn);
		className=this.getClass().getSimpleName();
					snap.capture(className);
		} catch (IOException | MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new MaintenancePage();
	}

}
