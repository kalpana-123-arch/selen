package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class GetTextMethd{
	
public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dasar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
      String url ="https://www.tutorialspoint.com/videotutorials/subscription.php";
      driver.get(url);
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      // identify element
      WebElement l = (WebElement) driver.findElements(By.cssSelector("h2"));
      // extract text with getText()
      System.out.println("getText() method:" + l.getText());
      driver.quit();
   }
}
