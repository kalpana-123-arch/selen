package options;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class Partial_Link { 
	
    public static void main(String[] args) {           
        // System Property for Chrome Driver   
System.setProperty("webdriver.chrome.driver","C:\\Users\\dasar\\Downloads\\chromedriver_win32\\chromedriver.exe");    
        // Instantiate a ChromeDriver class.      
    WebDriver driver=new ChromeDriver();    
        // Launch Website  
driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");         
    }  
}  
	