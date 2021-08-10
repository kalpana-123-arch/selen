package options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class TextMatch{
   public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\dasar\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String url = "https://www.tutorialspoint.com/index.htm";
      driver.get(url);
      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
      // identify element with text()
      WebElement l=driver.findElement(By.xpath("//*[text()='Library']"));
      // identify element with contains()
      WebElement m=driver.findElement(By.xpath("//*[contains(text(),'GATE')]"));
      System.out.println("Element with text(): " + l.getText());
      System.out.println("Element with contains(): " + m.getText());
      driver.quit();
   }
}
