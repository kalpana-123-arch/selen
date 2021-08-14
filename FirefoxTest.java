package project1;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.testng.annotations.Test; 
public class FirefoxTest 
{ 
	
  WebDriver driver; // Creating reference of WebDriver. 
@Test(priority = 1) 
public void driverSetup()
{ 
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\dasar\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
  System.out.println("Running Firefox"); 
  driver = new FirefoxDriver(); // Create an object of ChromeDriver class. 
 } 
@Test(priority = 2) 
public void getURL()
{ 
  driver.get("https://www.google.com"); 
 } 
@Test(priority = 3) 
public void getTitle()
{ 
   String title = driver.getTitle(); 
   System.out.println(title); 
  } 
@Test(priority = 4) 
public void closeBrowser()
{ 
   driver.close(); 
   System.out.println("Test successfully passed"); 
  } 
}
