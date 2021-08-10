package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class CloseWindow {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\dasar\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
//implicit wait
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
driver.findElement(By.name("q")).sendkeys("Selenium");
driver.findElement(By.name("btnk")).click();
// window handles
Set w = driver.getWindowHandles();

// window handles iterate
Iterator t = w.iterator();
String h = (String) t.next();
String p = (String) t.next();
// switching child window
driver.switchTo().window(h);
// close only the child browser window
driver.close();
}
}
