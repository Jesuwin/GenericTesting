package pageobjects;

import org.openqa.selenium.By;

public interface DashBoardPageObjects {

	By assignLeaveLink= By.xpath("//a/span[contains(text(),'Assign Leave')]");
	By leaveListLink=By.xpath("//a/span[contains(text(),'Leave List')]");
	By profileDropdownLink = By.linkText("Welcome Admin");
	By logoutLink=By.linkText("Logout");
	By timesheetLink=By.xpath("//div[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[3]/div/a/img");
	By empnameBox=By.id("employee");
	By viewBtn=By.id("btnView");
	By dashboardLink=By.linkText("Dashboard");
}
