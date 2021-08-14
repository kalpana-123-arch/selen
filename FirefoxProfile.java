package project1;

import java.util.concurrent.TimeUnit;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.ProfilesIni;

public class FirefoxProfile {
 public static void main(String[] args) {
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\dasar\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
ProfilesIni profile = new ProfilesIni();
org.openqa.selenium.firefox.FirefoxProfile myprofile = profile.getProfile("xyzProfile");
// Initialize Firefox driver
WebDriver driver = new FirefoxDriver();
//Maximize browser window
driver.manage().window().maximize();
//Go to URL which you want to navigate
driver.get("http://www.google.com");
//Set  timeout  for 5 seconds so that the page may load properly within that time
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//close firefox browser
driver.close();
}
}