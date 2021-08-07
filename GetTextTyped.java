package qafox.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
public class GetTextTyped{
   public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver",
"C:\\\\Users\\\\dasar\\\\Downloads\\\\geckodriver-v0.29.1-win64\\\\geckodriver.exe\\\\");
      WebDriver driver = new FirefoxDriver();
      //implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.get("https://www.google.com/");
      // identify element
      WebElement t =driver.findElement(By.name("q"));
      t.sendKeys("Tutorialspoint");
      // obtain value with getAttribute
      System.out.println("Value is: " + t.getAttribute("value"));
      driver.quit();
   }
}
