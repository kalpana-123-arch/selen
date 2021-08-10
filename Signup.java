package project1;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.*;

public class Signup { 
public static void main(String[] args)
{ 

//declaration and instantiation of objects/variables 
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dasar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe"); 
WebDriver driver = new ChromeDriver(); 
String baseUrl = "https://www.browserstack.com/users/sign_up"; 
driver.get(baseUrl);

//Get the Web Element corresponding to the field Business Email (Textfield)
WebElement email = driver.findElement(By.id("user_email_login"));

//Get the Web Element corresponding to the Password Field 
WebElement password = driver.findElement(By.id("user_password"));

//Find the Sign me in button
WebElement login = driver.findElement(By.id("user_submit"));

email.sendKeys("abc@xyz.com");
password.sendKeys("abcdef12345");

login.click(); 
System.out.println("Signed in with Click");
driver.close();

}
}
