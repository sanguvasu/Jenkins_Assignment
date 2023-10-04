package Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchURL {

	  WebDriver driver;

	    @BeforeMethod
	    public void beforeMethod() {

	    	// System.setProperty("webdriver.chrome.driver","C:\\Koteswar\\ChromeDriver\\chromedriver.exe");
	    	
	    	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    	 
	    	 // Instantiate a ChromeDriver class.
	    	        driver = new ChromeDriver();
	    	 
	    	        // Maximize the browser
	    	        driver.manage().window().maximize();
	    }

	    @Test
	    public void navigateToAUrl() {
	        // navigate to the web site
	        driver.get("http://demo-store.seleniumacademy.com/");
	        // Validate page title
	        Assert.assertEquals(driver.getTitle(), "Madison Island");
	    }
	    @AfterMethod
	    public void afterMethod() {

	        // close and quit the browser
	        driver.quit();
	    }
	}