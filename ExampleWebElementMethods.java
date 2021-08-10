package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleWebElementMethods {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dasar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
String Url = "https://google.com";
driver.get(Url);
WebElement sigin = driver.findElement(By.id("gb_70"));
//getLocation() WebElement method
Point location = sigin.getLocation();
System.out.println("Location of X :"+ location.getX()+ "," +"Location of Y :" +location.getY());
//getSize() WebElement method
Dimension size = sigin.getSize();
System.out.println("Width :"+size.getWidth()+ "," +"Height : "+size.getHeight());
//getText() WebElement method
String text = sigin.getText();
System.out.println("Text :" +text);
//getTagName() WebElement method
String tagName = sigin.getTagName();
System.out.println("Tagname :"+tagName);
//close the browser
driver.close();
}
}
