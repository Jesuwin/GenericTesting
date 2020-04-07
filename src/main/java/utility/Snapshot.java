package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import config.ConfigProperties;

public class Snapshot {

	WebDriver driver1=null;
	public Snapshot(WebDriver driver)
	{
		driver=this.driver1;
	}
	
	ConfigProperties prop=new ConfigProperties();
	 public void capture(String captureString) throws IOException
	    {
	        TakesScreenshot ts = (TakesScreenshot)driver1;
	      File srcFile=ts.getScreenshotAs(OutputType.FILE);
	      File dir=null;
		try {
			dir = new File(prop.fetchPropertyFromFile("screenshotfolder"));
		
	      if(dir.exists())
	      {
	    	  
	      }
	      else
	      {
	    	  dir.mkdir();
	      }
	      File destFile=new File(""+prop.fetchPropertyFromFile("screenshotfolder")+"/"+""+captureString+""+".png");
	    
	      FileHandler.copy(srcFile, destFile);}
		
		 catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 
}
}
