package pages;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import pom.BasePage;


public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}


	
	private final By usernameField = By.xpath("//input[@id='user-name']");
	private final By passwordfield = By.xpath("//input[@id='password']");
	private final By loginButton = By.xpath("//input[@id='login-button']");
	private final By addButton = By.xpath("(//button[contains(.,'Add to cart')])");
	
	
	public void LoginToApplication() throws InterruptedException
	{
		
		WebElement userName = driver.findElement((usernameField));
		userName.sendKeys("standard_user");
		WebElement passWord = driver.findElement((passwordfield));
		passWord.sendKeys("secret_sauce");
		WebElement login = driver.findElement((loginButton));
		login.click();
		Thread.sleep(5000);
		Reporter.log("User logged in scucessfully");
		
	}



	public void select_randomList() throws InterruptedException
	{
		List<WebElement> add_button = driver.findElements(addButton);
		Random rand = new Random();
		for (int i = 0; i < add_button.size(); i++)
		{
	        int randomIndex = rand.nextInt(add_button.size());
	        WebElement randomElement = add_button.get(randomIndex);
	        add_button.remove(randomIndex);
	        randomElement.click();
	    }
		Thread.sleep(5000);
	}
}
