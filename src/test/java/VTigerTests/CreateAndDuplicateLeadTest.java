package VTigerTests;

import java.util.Map;

import org.testng.annotations.Test;

import ObjectRepositories.CreatingNewLeadPage;
import ObjectRepositories.LeadInformationPage;
import ObjectRepositories.LeadsPage;
import genericutilities.TabNames;

public class CreateAndDuplicateLeadTest implements BaseClass {
@Test(retryAnalyzer = genericutilities.RetryImplementation.class)
	public void createLeadTest() {
		LeadsPage leads = pom.getLeads();
		CreatingNewLeadPage createLead = pom.getCreateLead();
		DuplicatingLeadPage duplicateLead = pom.getDuplicateLead();
		LeadInformationPage leadInfo = pom.getLeadInfo();
		
		home.clickRequiredTab(web, TabNames.LEADS);
		leads.clickCreateLead();
		Map<String, String> map = excel.readFromExcel("Create and Duplicate Lead");
		String lastName = map.get("Last Name") + jutil.generateRandomNum(100);
		createLead.setLastName(lastName);
		createLead.setCompany(map.get("Company"));
		createLead.clickSave();
		
		leadInfo.clickDuplicate();
		String newLastName = map.get("New Last Name") + jutil.generateRandomNum(100);
		duplicateLead.setLastName(newLastName);
		duplicateLead.clickSave();
	}
}


