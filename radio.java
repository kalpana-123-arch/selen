package project1; 
import java.io.IOException;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; 
public class radio { 
    public static void main(String[] args) throws IOException {       
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("file:///E:/Selenium class/Programs/Sonali/bin/project1/form2selenium.html");    
 
        WebElement radio = driver.findElement(By.xpath("//input[@id='i-green']"));
        radio.click();
 
                            WebElement radio2 = driver.findElement(By.xpath("//input[@value='Medium']"));
        radio2.click();
}
}
