package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlagPrvctice {
	@Test(priority = 1)
	public void demo1() {
		Reporter.log("demo", true);	
	}
	
	@Test
	public void demo2() {
		Reporter.log("demo2", true);	
	}
	@Test(priority = -2)
	public void demo3() {
		Reporter.log("demo3", true);	
	}
	@Test(priority = 2)
	public void demo4() {
		Reporter.log("demo4", true);	
	}
	
	

}
