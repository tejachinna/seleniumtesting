package VTigerTests;

import java.util.Map;

import org.testng.annotations.Test;

import genericutilities.BaseClass;
import genericutilities.TabNames;

public class createOrgTest  extends BaseClass{

	@Test
	public void createOrgTest() {
		OrganizationsPage org = pom.getOrg();
		OrganizationInformationPage orgInfo = pom.getOrgInfo();
		CreatingNewOrganizationPage createOrg = pom.getCreateOrg();
		
		home.clickRequiredTab(web, TabNames.ORGANIZATIONS);
		org.clickCreateOrg();
		
		Map<String, String> map = excel.readFromExcel("Create Organization With Industry And Type");
		createOrg.setOrgName(map.get("Organization Name"));
		createOrg.selectIndustry(web, map.get("Industry"));
		createOrg.selectType(web, map.get("Type"));
		createOrg.clickSave();
		
		orgInfo.clickDelete();
		web.handleAlert("ok");		
	}

}
