package base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.ConfigProperties;
import utility.MyException;

public class BasePage {

	 
	
	protected WebDriver driver1;
    protected WebDriverWait wait;
    ConfigProperties prop=new ConfigProperties();
    
    public BasePage(WebDriver driver) throws MyException {
		if (driver != null) {
			driver1 = driver;
			wait = new WebDriverWait(driver, 10);
		} else {
			throw new MyException("Singleton browser Instance Is Null");
		}
	}
    
    //Get the element
    protected WebElement getWebElement(By locator) throws MyException
    {
    	WebElement element=null;
    	
    	try {
    		element = driver1.findElement(locator);
    	}
    	catch(Exception e)
    	{
    		throw new MyException("Unable to locate the element, Please check the locator.");
    	}
    	
		return element;
    }
    
    //Get list of sub elements 
    
    protected List<WebElement> GetSubWebElements(By locator) throws MyException
    {
    	List<WebElement> list=null;
    	try {
    	list=driver1.findElements(locator);
    	}
    	catch(Exception e)
    	{
    		throw new MyException("Unable to locate the sub elements, Please check the locator.");
    	}
    	return list;
    }
    
    //Go to the specified url
    protected void navigateToWebsite(String url) 
    {
    	
		
		
		
    	driver1.get(url);
    	
    }
    
    //Maximize the window
    protected void maximizeBrowser()
    {
    	driver1.manage().window().maximize();
    }
    
    //Get the title of the page
    protected String getPageTitle() throws MyException
    {
    	String title=null;
    	
    	title=driver1.getTitle();
    
    	if(title==null)
    	throw new MyException("Unable to retrieve the page title");
    	
    
    	
    	return title;
    }
    
    //Close the active driver instance 
    
   protected void closeDriver()
   {
	   driver1.quit();
	  
   }
   
   
   //wait for a webelement
   
   protected void waitTillElementFound(WebElement element, int time)
   {
	   wait.until(ExpectedConditions.visibilityOf(element));
   }
   
 //wait til Page Load
   
   protected void waitTillPageLoad(int time)
   {
	   driver1.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
   }
   
   
   //Go forward
   
   protected void navigateForward()
   {
	   driver1.navigate().forward();
   }
    
   //Go back
    protected void navigateBack()
    {
    	driver1.navigate().back();
    }
    
    //refresh
    
    protected void refresh()
    {
    	driver1.navigate().refresh();
    }
    
    //Click a webelement
    
    protected void clickElement(By locator) throws MyException
    {
    	try {
    		WebElement element=getWebElement(locator);
    		boolean elementIsClickable = element.isEnabled();
    		while (elementIsClickable)
    		{
    			element.click();
    		}
    		}
    	catch(Exception e)
    	{
    		throw new MyException("Element is not clickable");
    	}
    }
    
    //clear a textfield
    
    protected void clearTextField(WebElement element)
    {
    	element.clear();
    }
    
    
    //Drag and drop action 
    
    protected void dragAndDrop(WebElement fromElement,WebElement toElement)
    {
    	Actions action=new Actions(driver1);
    	action.dragAndDrop(fromElement, toElement);
    }
    
    //Select methods
    
    protected void selectElementByValue(WebElement element,String value)
    {
    	Select select = new Select(element);
    	select.selectByValue(value);
    }
    
    
    protected void selectElementByVisibleText(WebElement element,String text)
    {
    	Select select = new Select(element);
    	select.selectByVisibleText(text);
    }
    
    protected void selectElementByIndex(WebElement element,int index)
    {
    	Select select = new Select(element);
    	select.selectByIndex(index);
    }
    
    //mouse hover
    
    protected void mouseOver(WebElement element)
    {
    	
    	Actions action=new Actions(driver1);
    	action.moveToElement(element).build().perform();
    	
    }
    //send keys
    
    protected void type(By locator,String value)
    {
    	WebElement element=null;
		try {
			element = getWebElement(locator);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	element.sendKeys(value);
    }
    
    
    
}
