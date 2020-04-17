package pageobjects;

import org.openqa.selenium.By;

public interface LeaveListPageObjects {
By leaveLink=By.linkText("Leave");
By reportsLink=By.linkText("Reports");
By usageLink=By.linkText("Leave Entitlements and Usage Report");
By generateDropDown=By.id("leave_balance_report_type");
By empBox=By.id("leave_balance_employee_empName");
By viewBtn=By.id("viewBtn");


}
