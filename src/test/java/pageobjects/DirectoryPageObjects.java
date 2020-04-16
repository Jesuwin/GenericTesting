package pageobjects;

import org.openqa.selenium.By;

public interface DirectoryPageObjects {
	By directorylink=By.id("menu_directory_viewDirectory");
	
	By searchName=By.id("searchDirectory_emp_name_empName");
	
	By jobTitle=By.id("searchDirectory_job_title");
	By location=By.id("searchDirectory_location");
	By searchBtn=By.id("searchBtn");

}
