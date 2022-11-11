package extendReport;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseSetup{
	
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	
	
	@BeforeSuite
	public void setUp()
	{
		extent = new ExtentReports();
		reporter = new ExtentSparkReporter("C:\\Users\\nasee\\eclipse-workspace\\SeleniumFramework\\Report\\Report.html");
		extent.attachReporter(reporter);
	}
	
	@AfterSuite
	public void teardown()
	{
		
	}

}
