package TestNG;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MavenParameterization {
	@Test
	public void paramerterizationTest() {
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		System.out.println(url + "\n" + browser);
		
	}
	

}
