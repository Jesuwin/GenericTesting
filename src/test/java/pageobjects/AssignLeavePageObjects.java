package pageobjects;

import org.openqa.selenium.By;

public interface AssignLeavePageObjects {

	By empNameTxtField= By.id("assignleave_txtEmployee_empName");
	By leaveType=By.id("assignleave_txtLeaveType");
	By fromDate=By.id("assignleave_txtFromDate");
	By toDate=By.id("assignleave_txtToDate");
	By duration=By.id("assignleave_duration_duration");
	By partialDay=By.id("assignleave_partialDays");
	By comment=By.id("assignleave_txtComment");
	By assignBtn= By.id("assignBtn");
	By popupOkayBtn=By.id("confirmOkButton");
}
