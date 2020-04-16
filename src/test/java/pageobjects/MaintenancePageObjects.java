package pageobjects;

import org.openqa.selenium.By;

public interface MaintenancePageObjects {

	By maintenanceLink=By.id("menu_maintenance_purgeEmployee");
	By purgeRecordsLink=By.linkText("Purge Records");
	By canditateRecordsLink=By.linkText("Candidate Records");
	By vacancyTxt=By.id("candidate_empName");
	By confirmPass=By.id("confirm_password");
	By verifyBtn=By.xpath("//form[@id=\"frmPurgeEmployeeAuthenticate\"]/div/div/input");
	
	By searchBtn=By.xpath("//form[@id=\"frmPurgeCandidateRecords\"]/div/div/input");
	
}
