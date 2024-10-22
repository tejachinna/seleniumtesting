package ObjectRepositories;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationsPage {
	
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createOrgBTN;
	private  List<WebElement> organizations;
	
	public OrganisationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickCreateOrg() {
		createOrgBTN.click();
	}
	
	public boolean searchOrganization(String orgName) {
		boolean  isPresent = false;
		
		for(WebElement org : organizations) {
			if(org.getText().equals(orgName)) {
				isPresent = true;
				break;
			}
		}
		return isPresent;
	}

}
