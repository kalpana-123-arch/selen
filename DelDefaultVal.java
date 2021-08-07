package attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DelDefaultVal{
   public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\dasar\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String url = "https://www.tutorialspoint.com/index.htm";
      driver.get(url);
      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
      // identify element
      WebElement l = driver.findElement(By.id("gsc-i-id1"));
      // input text
      l.sendKeys("Selenium");
      // delete default value with clear()
      l.clear();
      driver.quit();
   }
}
