package attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class AttributeTest {
 
   	WebDriver driver;
   	
   	//Method to set up the browser and open the dummy website
   	@BeforeTest
   	public void setUp() {
          	
          	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dasar\\Downloads\\chromedriver_win32");
          	driver = new ChromeDriver();
          	driver.get("https://phptravels.com/demo/");
          	driver.manage().window().maximize();
   	}
   	
   	//Test method to get the different attribute values
   	@Test
   	public void getAttrVals() {
          	
          	//Fetching the image source
          	WebElement image = driver.findElement(By.xpath("//img[@class=\"well-sm icon-resources img100\"]"));
          	System.out.println("The image source is : "+image.getAttribute("src"));
          	
          	//Fetching the placeholder value
          	WebElement emailField = driver.findElement(By.id("address"));
          	String placeholderVal = emailField.getAttribute("placeholder");
          	String expectedVal = "your@email.com";
          	if(placeholderVal.equalsIgnoreCase(expectedVal))
                 	System.out.println("The placeholder value is expected, ie : "+placeholderVal);
          	else
                 	System.out.println("The placeholder value is not correct --- " +placeholderVal);
          	
          	//Getting attribute value of an attribute that is not present on the page
          	WebElement logInBtn = driver.findElement(By.xpath("//*[@class=\"btn yx-nfn yx-njg\"]"));
          	System.out.println("The value of an attribute that doesn't exist is : " +logInBtn.getAttribute("type"));
   	}
   	
   	//Method to close the webdriver session
   	@AfterTest
   	public void burnDown() {
          	driver.quit();
   	}
   	
   	
}
