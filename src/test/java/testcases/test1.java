package testcases;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import config.ConfigProperties;

import dataprovider.MyDataProvider;
import utility.MyException;
import utility.Snapshot;
import utility.WebDriverFactory;

public class test1 {
	
	WebDriverFactory fac=null;
	WebDriver driver=null;
	Snapshot snap=null;
	ConfigProperties prop=null;
	
	@Test(dataProvider="Authentication", dataProviderClass = MyDataProvider.class)
	public void f(Map<Object, Object> map)
	{
		fac=WebDriverFactory.getInstance();
		driver=fac.getDriver();
		prop=new ConfigProperties();
		snap=new Snapshot(driver);
		try {
			driver.get(prop.fetchPropertyFromFile("url"));
		
				String username=(String) map.get("uname");
				String password=(String) map.get("pass");
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		
			snap.capture("secondsnap");
		
		
		
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			
		
		
		
	}
	
	
	}
