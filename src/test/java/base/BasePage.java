package base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.ConfigProperties;
import utility.MyException;
import utility.Snapshot;
import utility.WebDriverFactory;


public class BasePage {

	 
	
	protected WebDriver driver1;
    protected WebDriverWait wait;
    public ConfigProperties prop;
    protected JavascriptExecutor js;
    WebDriverFactory fac;
    public Snapshot snap;
    private WebElement element;
    public BasePage()  {
			fac=WebDriverFactory.getInstance();
			driver1 =fac.getDriver();
			wait = new WebDriverWait(driver1, TestUtil.WEBDRIVER_WAIT_TIME);
			
			prop=new ConfigProperties();
			snap=new Snapshot(driver1);
		} 
	
    
   
  //Go to the specified url from property file
    protected void navigateToWebsite() 
    {
    	try {
			driver1.get(prop.fetchPropertyFromFile("url"));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    //Get the element
    protected WebElement getWebElement(By locator) throws MyException
    {
    	
    	
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
    
    
    public void clickOnUsingJs(WebElement element) {
    	JavascriptExecutor executor = (JavascriptExecutor)driver1;
    	executor.executeScript("arguments[0].click();", element);
    	}
    	public void type(String text, WebElement element) {
    		
    		
    		((JavascriptExecutor) driver1).executeScript("arguments[0].scrollIntoView(true);", element);
    		element.clear();
    		element.sendKeys(text);
    		
    		
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
   //get webdriver

   protected WebDriver getDriver()
   {
	   return driver1;
   }
   
   //wait for a webelement
   
   protected void waitTillElementFound(WebElement element, int time)
   {
	   wait.until(ExpectedConditions.visibilityOf(element));
   }
   
 //wait til Page Load
   
   protected void waitTillPageLoad()
   {
	   driver1.manage().timeouts().pageLoadTimeout(TestUtil.PAGELOAD_WAIT_TIME, TimeUnit.SECONDS);
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
    
    protected void clickOn(By locator) throws MyException
    {
    	element=getWebElement(locator);
    			element.click();
    		
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
