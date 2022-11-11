package Factory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	public WebDriver InitialiizeDriver() {

		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nasee\\eclipse-workspace\\SeleniumFramework\\target\\DriverClass_Lates\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;
	}
}
