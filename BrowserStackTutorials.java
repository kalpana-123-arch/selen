package project1;

import static org.testng.Assert.assertFalse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class BrowserStackTutorials {
@Test
public void testAssertFunctions() {
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\dasar\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.browserstack.com/");
Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform");
assertFalse(verifyTitle);
}
}
