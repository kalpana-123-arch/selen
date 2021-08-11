package project1;

import java.io.File;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
 public class FacebookScreenshot {
 // Create Webdriver reference
WebDriver driver;
@Test
public void captureScreenshot() throws Exception
{
 // Initiate ChromeDriver browser
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\dasar\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
 // Maximize the browser
driver.manage().window().maximize();
// Pass application url
driver.get("http://www.facebook.com");
 // Here we are forcefully passing wrong id so that it will fail our testcase
driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");
 
}
// It will execute after every test execution 
@AfterMethod
public void tearDown(ITestResult result)
{
// Here will compare if test is failing then only it will enter into if condition
if(ITestResult.FAILURE==result.getStatus())
{
try 
{
// Create reference of TakesScreenshot
TakesScreenshot ts=(TakesScreenshot)driver;
// Call method to capture screenshot
File source=ts.getScreenshotAs(OutputType.FILE);
// Copy method  specific location here it will save all screenshot in our project home directory and
// result.getName() will return name of test case so that screenshot name will be same
try{
FileHandler.copy(source, new File("./Screenshots/"+result.getName()+".png"));
System.out.println("Screenshot taken");
}
} 
catch (Exception e)
{
System.out.println("Exception while taking screenshot "+e.getMessage());
} 
}
// close application
driver.quit();
}
 }
