package Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class NavigationTest {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        // initialize new WebDriver session
        driver = new ChromeDriver();
        
    }

    @Test
    public void navigateToAUrl() {
        // navigate to the web site
        driver.get("https://www.javatpoint.com/");
        driver.manage().window().maximize();
        System.out.println("=======navigateToAUrl=======");
        // Validate page title
       // Assert.assertEquals(driver.getTitle(), "Madison Island");
    }
    
    @Test
    public void Search() {
    	driver.get("https://www.amazon.in/");
    	driver.manage().window().maximize();
    	System.out.println("========Search======");
    	WebElement serchText= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    	serchText.sendKeys("Mobiles");
    	WebElement searchElemnt= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    	searchElemnt.click();
    }
    
    @Test
    public void MenuSelect() {
    	driver.get("https://www.amazon.in/");
    	driver.manage().window().maximize();
    	System.out.println("========MenuSelect======");
    	WebElement MenuElement= driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(text(),'Customer Service')]"));
    	MenuElement.click();
    }
    
    
    @Test
    public void MobileSelect()throws Exception {
    	driver.get("https://www.amazon.in/");
    	driver.manage().window().maximize();
    	System.out.println("========MobileSelect======");
    	WebElement MenuWebElement= driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(text(),'Mobiles')]"));
    	MenuWebElement.click();
    	//driver.wait(5000);
    	//WebElement checkBoxElement = driver.findElement(By.xpath("//input[@aria-labelledby=\"Apple\"]"));
    	//checkBoxElement.click();
    }
    
    @Test
    public void DropdownSelect()throws Exception {
    	driver.get("https://www.amazon.in/");
    	driver.manage().window().maximize();
    	System.out.println("========DropdownSelect======");
    	Select drpCountry = new Select(driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]")));
		drpCountry.selectByVisibleText("Alexa Skills");
    }
    
    
    @AfterMethod
    public void afterMethod() {

        // close and quit the browser
        driver.quit();
    }
}