package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import config.ConfigProperties;

public class Snapshot {

	WebDriver driver;
	public Snapshot(WebDriver driver1)
	{
		this.driver=driver1;
	}
	ConfigProperties prop=new ConfigProperties();
	 public void capture(String capturename) throws IOException
	    {
	        TakesScreenshot ts = (TakesScreenshot)driver;
	      File srcFile=ts.getScreenshotAs(OutputType.FILE);
	      File dir=new File("Screenshots");
	      if(dir.exists())
	      {
	    	  
	      }
	      else
	      {
	    	  dir.mkdir();
	      }
	      File destFile=new File("Screenshots/"+capturename+".png");
	      //FileUtils.copyFile(srcFile,destFile);
	      FileHandler.copy(srcFile, destFile);
	      
	       
	               
	                     
	       
	    
	}
	 
}

