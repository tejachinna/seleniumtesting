package VTigerTests;


import java.util.Map;


import org.testng.annotations.Test;

import ObjectRepositories.ContactInformationPage;
import ObjectRepositories.ContactsPage;
import genericutilities.BaseClass;
import genericutilities.TabNames;

public class CreateContactTest extends BaseClass {

	@Test
	public void createContactWithOrgTest() {
		ContactsPage contact = pom.getContact();
		CreatingNewContactPage createContact = pom.getCreateContact();
		ContactInformationPage contactInfo = pom.getContactInfo();
		
		home.clickRequiredTab(web, TabNames.CONTACTS);
		contact.clickCreateContact();
		
		Map<String, String> map = excel.readFromExcel("Create Contact With Organization");
		createContact.setLastName(map.get("Last Name"));
		createContact.selectOrganization(web, map.get("Organization Name"));
		createContact.clickSave();
		
		contactInfo.clickDelete();
		web.handleAlert("OK");
	}

}
