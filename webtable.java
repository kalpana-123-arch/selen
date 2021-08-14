package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class webtable {
    public static void main (String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\dasar\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
 
        //Store the table size
        WebElement webtable = driver.findElement(By.xpath("//div[contains(@class,'ReactTable')]"));
        
        //Get the rows which has data
        List<WebElement> rowsWithData = webtable.findElements(By.xpath("//div[contains(@class,'rt-td') and text()]/ancestor::div[contains(@class,'rt-tr-group')]"));
        
        //Print the text of 2nd row        
        System.out.println("Data of 2nd row is: \n" + rowsWithData.get(1).getText());
        
        driver.quit();
    }
}
