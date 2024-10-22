package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPge {


	// Declaration
	@FindBy(name = "email")
	private WebElement emailTF;

	@FindBy(id = "password")
	private WebElement passwordTF;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCB;

	@FindBy(id = "toPasswordRecoveryPageLink")
	private WebElement forgotPasswordLink;

	@FindBy(name = "login")
	private WebElement loginBTN;
	
	// Initialization
	public LoginPge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Utilization
	public void setEmail(String email) {
		emailTF.sendKeys(email);
	}
	
	public void setPassword(String password) {
		passwordTF.sendKeys(password);
	}
	
	public void clickKeepMeLoggedIn() {
		keepMeLoggedInCB.click();
	}
	
	public void clickForgotPassword() {
		forgotPasswordLink.click();
	}
	
	public void clickLogin() {
		loginBTN.click();
	}
}

