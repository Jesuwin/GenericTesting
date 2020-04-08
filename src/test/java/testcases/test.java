package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import config.ConfigProperties;
import pages.LoginPage;
import utility.MyException;
import utility.WebDriverFactory;

public class test {

	ConfigProperties prop=new ConfigProperties();
	@Test
	public void test()
	{
		WebDriverFactory fac=WebDriverFactory.getInstance();
		WebDriver driver=fac.getDriver();
		LoginPage page=new LoginPage();
		
		page.Userlogin();
		
	}
}
