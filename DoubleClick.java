package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\dasar\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://duckduckgo.com/"); 
driver.manage().window().maximize();

//Instantiating Actions class
Actions act = new Actions(driver);

//Locate WebElement to perform double click 
WebElement btnElement = driver.findElement(By.id("search_form_input_homepage"));

//Double Click the button
act.doubleClick(btnElement).perform();

System.out.println("Double click operation performed");
driver.quit();
}
}
