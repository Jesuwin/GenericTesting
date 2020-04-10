package pageobjects;

import org.openqa.selenium.By;

public interface DashBoardPageObjects {

	By assignLeaveLink= By.xpath("//a/span[contains(text(),'Assign Leave')]");
	By leaveListLink=By.xpath("//a/span[contains(text(),'Leave List')]");
	By profileDropdownLink = By.linkText("Welcome Admin");
	By logoutLink=By.linkText("Logout");
}
