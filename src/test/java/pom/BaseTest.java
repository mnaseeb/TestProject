package pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Factory.DriverManager;


public class BaseTest {
	
	public WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }
    public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	
	@BeforeMethod
	public void startDriver()
	{
		
		extent = new ExtentReports();
		reporter = new ExtentSparkReporter("C:\\Users\\nasee\\eclipse-workspace\\SeleniumFramework\\Report\\Report.html");
		extent.attachReporter(reporter);
		
		
		driver = new DriverManager().InitialiizeDriver();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		driver.quit();
		extent.flush();
	}
	
	
}
