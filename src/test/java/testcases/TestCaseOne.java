package testcases;

import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import base.BasePage;
import dataprovider.MyDataProvider;
import pages.AssignLeavePage;
import pages.LoginPage;
import utility.MyException;

public class TestCaseOne extends Base {
	
	
	
	
	@BeforeMethod
	public void setup()
	{
		
		login=new LoginPage();
		
	}
	
	
	
	
	@Test(dataProvider="Authentication", dataProviderClass = MyDataProvider.class)
	public void loginPageTest(Map<Object, Object> map) 
	{String username=(String) map.get("uname");
	String password=(String) map.get("pass");
	

	dashboard=login.userLogin(username, password);
		
	}

	@Test(dependsOnMethods="loginPageTest")
	public void DashBoardTest()
	{
		assignLeave=dashboard.clickAssignLeave();
	}

	@Test(dataProvider="AssignLeaveProvider",dataProviderClass=MyDataProvider.class,dependsOnMethods="DashBoardTest")
	public void assignPageTest(Map<Object,Object> map)
	{
		String emp=(String) map.get("empname");
		String leave=(String) map.get("leavetype");
		String fromDate=(String) map.get("fromdate");
		String toDate=(String) map.get("todate");
		String duration=(String) map.get("duration");
		String comm=(String) map.get("comment");
		String parDay=(String) map.get("partialday");
		
		
		pim=assignLeave.fillAssignLeaveForm(emp, leave, fromDate, toDate, duration, comm,parDay);
	}
	
	@Test(dataProvider="PIMProvider",dataProviderClass=MyDataProvider.class, dependsOnMethods="assignPageTest")
	public void PimPageTest(Map<Object,Object> map)
	{
		pim.navigateToPIMModule();
		String ename=(String) map.get("emptosearch");
		pim.findEmpDetail(ename);
	}
	
	@Test(dataProvider="newEmpPimProvider",dataProviderClass=MyDataProvider.class, dependsOnMethods="PimPageTest")
	public void newEmployeeTest(Map<Object,Object> map)
	{
		
		String fname=(String) map.get("firstname");
		String mname=(String) map.get("middlename");
		String lname=(String) map.get("lastname");
		String eid=(String) map.get("empid");
		
		pim.addNewEmployee(fname, mname, lname, eid);
	}
	}
