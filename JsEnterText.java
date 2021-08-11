package project1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
public class JsEnterText{
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver",
"C:\\\\Users\\\\dasar\\\\Downloads\\\\geckodriver-v0.29.1-win64\\\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      //implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
      // identify element
      WebElement l = driver.
      findElement(By.xpath("//*[text()='Click for JS Alert']"));
      l.click();
      //switch focus to alert
      Alert a = driver.switchTo().alert();
      //get alert text
      String s= driver.switchTo().alert().getText();
      System.out.println("Alert text is: " + s);
      //accepting alert
      a.accept();
      driver.quit();
   }
}

