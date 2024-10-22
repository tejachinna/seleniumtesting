package genericutilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import ObjectRepositories.HomePage;
import ObjectRepositories.PageObjectManager;

public class BaseClass {

//@BeforeSuite
//@BeforeTest

protected WebDriverUtility web;
protected JavaUtility jutil;
protected ExcelUtility excel;
protected PropertiesUtility property;
protected WebDriver driver;

protected PageObjectManager pom;
protected LoginPage login;
protected HomePage home;
protected SoftAssert soft;

public static WebDriver sdriver;
public static JavaUtility sjutil;
public static WebDriverUtility sweb;

@BeforeClass
public void classConfig() {
	web = new WebDriverUtility();
	jutil = new JavaUtility();
	property = new PropertiesUtility();
	
	property.propertiesInit(IConstantPath.PROPERTIES_PATH);
	
	driver = web.launchBrowser(property.getDataFromProperties("browser"));
	web.maximizeBrowser();
	
	long time = (Long)jutil.convertStringToAnyDataType(DataType.LONG, 
					property.getDataFromProperties("timeouts"));
	web.waitTillElementFound(time);
	
	sdriver = driver;
	sjutil = jutil;
	sweb = web;
	
}

@BeforeMethod
public void methodConfig() {
	excel = new ExcelUtility();
	excel.excelInit(IConstantPath.EXCEL_PATH, "Sheet1");
	
	pom = new PageObjectManager(driver);
	
	web.navigateToApp(property.getDataFromProperties("url"));
	login = pom.getLogin();
	login.loginToVtiger(property.getDataFromProperties("username"), 
			property.getDataFromProperties("password"));
	home = pom.getHome();
}

@AfterMethod
public void methodTeardown() {
	home.signOutOfVtiger(web);
	
	excel.closeExcel();
}

@AfterClass
public void classTeardown() {
	web.quitAllWindows();
}

//@AfterTest
//@AfterSuite
}
