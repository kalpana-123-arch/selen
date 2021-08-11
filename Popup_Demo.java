package project1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Demo { 
public static void main(String[] args) throws InterruptedException, AWTException { 
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\dasar\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
driver.get("Webpage link"); 
driver.manage().window().maximize(); 
Thread.sleep(5);
driver.findElement(By.id("PopUp")).click(); // Clicking on the popup button
Robot robot = new Robot();
robot.mouseRelease((int) 400.5); 
// Navigating through mouse hover. Note that the coordinates might differ, kindly check the coordinates of x and y axis and update it accordingly.
robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
Thread.sleep(2000);
robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
Thread.sleep(2000);
driver.quit();
}
}
