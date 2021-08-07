package qafox.Selenium;	

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoThree {

   public static void main(String[] args) throws InterruptedException  {
	   
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
      // identify element and input text inside it
      driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
      Thread.sleep(2000);
      
      JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("document.getElementById('input-email')).setAttribute('value', 'QAFox')");
      
      driver.quit();
   }	
}
