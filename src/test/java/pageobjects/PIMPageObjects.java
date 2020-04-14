package pageobjects;

import org.openqa.selenium.By;

public interface PIMPageObjects {

	By pimLink= By.linkText("PIM");
	By empList=By.id("menu_pim_viewEmployeeList");
	By empname=By.id("empsearch_employee_name_empName");
	By searchBtn=By.id("searchBtn");
	By addEmpLink=By.linkText("Add Employee");
	By firstNameTxt=By.id("firstName");
	By middleNameTxt=By.id("middleName");
	By lastNameTxt=By.id("lastName");
	By newEmpId=By.id("employeeId");
	By photoBtn=By.id("photofile");

}