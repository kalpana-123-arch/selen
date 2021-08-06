import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dasar\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe\\");

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		
		try {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		Thread.sleep(1800);
		
		
	}catch(Exception e) {
		System.out.println(e);
		
	}
	}
}
