package options;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class iFramesDemo {
public static void main(String[] args) throws InterruptedException {
 
System.setProperty("webdriver.gecko.driver","C:\\Users\\dasar\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://www.softwaretestinghelp.com/");
 
//Finding all iframe tags on a web page
List<WebElement> elements = driver.findElements(By.tagName("iframe"));
int numberOfTags = elements.size();
System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
 
// Switch to the frame using the frame id
System.out.println("Switching to the frame");
driver.switchTo().frame("aswift_0");
 
// Print the frame source code
System.out.println("Frame Source" +driver.getPageSource());
 
// Switch back to main web page
driver.switchTo().defaultContent();
 
driver.quit();
}
}
