package dataprovider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import Entity.LoginEntity;
import config.ConfigProperties;
import utility.MyException;

public class MyDataProvider {

	
	
	ConfigProperties prop=new ConfigProperties();
	
	public List<LoginEntity> ReadDataFromCSV() {
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		String csvFile;
		String uname=null;
		String pass=null;
		List<LoginEntity> list=new LinkedList();
		LoginEntity logindetail=new LoginEntity();
		try {
			csvFile = prop.fetchPropertyFromFile("csvfilename");
		
		
			 br = new BufferedReader(new FileReader(csvFile));
			  while ((line = br.readLine()) != null)
			  
			  {
				  String[] data = line.split(cvsSplitBy);
				  uname=data[0];
				  pass=data[1];
				  logindetail.setUsername(uname);
				  logindetail.setPassword(pass);
				  list.add(logindetail);
				  
			  }
		}
		catch(MyException e) {
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
}
