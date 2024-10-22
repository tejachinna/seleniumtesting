package POM;

import java.time.Duration;

public class LogInTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage login = new LoginPage(driver);
		login.setEmail("admin");
		login.setPassword("admin");
		login.clickKeepMeLoggedIn();
		login.clickLogin();
		
		Thread.sleep(2000);
		driver.quit();
	}

}

