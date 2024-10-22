package ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadInformationPage {

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement pageHeader;
	
	@FindBy(name="Duplicate")
	private WebElement duplicateBTN;
	
	@FindBy(name="Delete")
	private WebElement deleteBTN;
	
	public LeadInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void clickDuplicate() {
		duplicateBTN.click();
	}
	
	public void clickDelete() {
		deleteBTN.click();
	}

}
