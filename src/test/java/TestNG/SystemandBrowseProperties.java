package TestNG;

import org.testng.annotations.Test;

public class SystemandBrowseProperties {
	
	
@Test

public void demo() {
	System.getProperties().list(System.out);
	
}
}
