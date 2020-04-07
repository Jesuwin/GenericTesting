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

	 private static final int timeout = 5;
	
	protected WebDriver driver;
    protected WebDriverWait wait;
    ConfigProperties prop=new ConfigProperties();
    
    //constructor
    public BasePage(WebDriver driver) throws MyException {
    	if(driver!=null)
    	{

        this.driver = driver;
        wait = new WebDriverWait(driver, timeout);
        PageFactory.initElements(driver, this);
    }
    	else
    	{
    		throw new MyException("Singleton browser instance isn't created.");
    	}
    }
    
    //Get the element
    protected WebElement getWebElement(By locator) throws MyException
    {
    	WebElement element=null;
    	
    	try {
    		element = driver.findElement(locator);
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
    	list=driver.findElements(locator);
    	}
    	catch(Exception e)
    	{
    		throw new MyException("Unable to locate the sub elements, Please check the locator.");
    	}
    	return list;
    }
    
    //Go to the specified url
    public void navigateToWebsite() 
    {
    	String url=null;
		try {
			url = prop.fetchPropertyFromFile("url");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.get(url);
    	
    }
    
    //Maximize the window
    protected void maximizeBrowser()
    {
    	driver.manage().window().maximize();
    }
    
    //Get the title of the page
    protected String getPageTitle() throws MyException
    {
    	String title=null;
    	
    	title=driver.getTitle();
    
    	if(title==null)
    	throw new MyException("Unable to retrieve the page title");
    	
    
    	
    	return title;
    }
    
    //Close the active driver instance 
    
   protected void closeDriver()
   {
	   driver.quit();
	  
   }
   
   
   //wait for a webelement
   
   protected void waitTillElementFound(WebElement element, int time)
   {
	   wait.until(ExpectedConditions.visibilityOf(element));
   }
   
 //wait til Page Load
   
   public void waitTillPageLoad(int time)
   {
	   driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
   }
   
   
   //Go forward
   
   public void navigateForward()
   {
	   driver.navigate().forward();
   }
    
   //Go back
    public void navigateBack()
    {
    	driver.navigate().back();
    }
    
    //refresh
    
    public void refresh()
    {
    	driver.navigate().refresh();
    }
    
    //Click a webelement
    
    protected void clickElement(WebElement element) throws MyException
    {
    	try {
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
    	Actions action=new Actions(driver);
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
    	
    	Actions action=new Actions(driver);
    	action.moveToElement(element).build().perform();
    	
    }
    
    
}
