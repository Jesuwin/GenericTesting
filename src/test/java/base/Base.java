package base;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.ConfigProperties;
import pages.AssignLeavePage;
import pages.DashboardPage;
import pages.LoginPage;
import utility.Snapshot;
import utility.WebDriverFactory;

public class Base {
	//times
	public static int WEBDRIVER_WAIT_TIME=10;
	public static int PAGELOAD_WAIT_TIME=10;
	
	
	//pages
	protected LoginPage login;
	protected DashboardPage dashboard;
	protected BasePage base;
	protected AssignLeavePage assignLeave;
	
	
	//dp
	

	protected WebDriver driver1;
    protected WebDriverWait wait;
    protected ConfigProperties prop;
    protected JavascriptExecutor js;
    WebDriverFactory fac;
    protected Snapshot snap;
    protected WebElement element;
    JavascriptExecutor executor ;
    protected Robot rob;

    List<WebElement> list;
    String title;
    Select select;
}
