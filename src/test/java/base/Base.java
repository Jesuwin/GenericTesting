package base;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.ConfigProperties;
import dataprovider.MyDataProvider;
import pages.AssignLeavePage;
import pages.DashboardPage;
import pages.DirectoryPage;
import pages.EmployeePage;
import pages.EportalLoginPage;
import pages.LeaveListPage;
import pages.LoginPage;
import pages.MaintenancePage;
import pages.PIMPage;
import utility.ExcelUtility;
import utility.Snapshot;
import utility.WebDriverFactory;

public class Base {
	//times
	public static int WEBDRIVER_WAIT_TIME=10;
	public static int PAGELOAD_WAIT_TIME=10;
	public static int THREAD_SLEEP_WAIT_TIME=2000;
	
	
	//pages
	protected LoginPage login;
	protected DashboardPage dashboard;
	protected BasePage base;
	protected AssignLeavePage assignLeave;
	protected PIMPage pim;
	protected EportalLoginPage eportallogin;
	protected EmployeePage emppage;
	protected DirectoryPage dirpage;
	protected MaintenancePage mpage;
	protected LeaveListPage leavepage;
	
	//dp
	

	protected WebDriver driver1;
    protected WebDriverWait wait;
    protected ConfigProperties prop;
    protected JavascriptExecutor js;
    protected WebDriverFactory fac;
    protected Snapshot snap;
    protected WebElement element;
    protected JavascriptExecutor executor ;
    protected Robot rob;
    protected MyDataProvider dataprov;
    protected ExcelUtility excelutil;
    

    protected List<WebElement> list;
    protected String title;
    protected Select select;
    protected String className;
    protected String intToStringTxt;
}
