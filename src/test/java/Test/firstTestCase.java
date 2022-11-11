package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;

import pages.HomePage;
import pom.BaseTest;


public class firstTestCase extends BaseTest {


	@Test
	public void firstTest() throws InterruptedException
	{

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		HomePage homepage = new HomePage(driver);
		homepage.LoginToApplication();
		homepage.select_randomList();
		
		
	}

}
