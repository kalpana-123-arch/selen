package options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Match{
	
public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\dasar\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
String url = "https:\\www.browserstack.com";
driver.get(url);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Locating element with text()
WebElement e = driver.findElement(By.xpath("//*[text()='Get started free']"));

System.out.println("Element with text(): " + e.getText() );
driver.quit();

}
}
