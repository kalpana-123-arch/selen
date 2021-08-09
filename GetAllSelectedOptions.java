package project1;

import java.util.ArrayList; 
import java.util.List; 
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.support.ui.Select; 

public class GetAllSelectedOptions 
{ 
public static void main(String[] args) 
{ 
 WebDriver driver; 
 driver = new FirefoxDriver(); 
 driver.manage().window().maximize(); 
 String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html"; 
 driver.get(URL); 

// Wait for some time to load the whole web page. 
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

// Locate dropdown element on web page by By.xpath. 
  WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']")); 

// Create an object of Select class and pass the dropdown of type WebElement as an argument. 
   Select multiplechoicelist = new Select(dropdown); 

// Verify that dropdown allows the multiple-choice list or not. 
  if(multiplechoicelist.isMultiple())
  { 
    System.out.println( "Dropdown allows multiple-choice list"); 
  } 
 else { 
    System.out.println("Dropdown does not allow multiple-choice"); 
  } 
// If multiple-choice allow, select the different choice by sending visible texts. 
   multiplechoicelist.selectByVisibleText("July"); 
   multiplechoicelist.selectByVisibleText("May"); 
   multiplechoicelist.selectByVisibleText("March"); 

// Verify that the number of choices in the list selected. 
  if(multiplechoicelist.getAllSelectedOptions().size() == 3) 
  { 
    System.out.println("3 options have been chosen:"); 
  } 
else { 
  System.out.println("Code not worked"); 
 } 
// Create a List. For this, create an object of ArrayList class by using the reference of List interface. 
    List<String> expectedSelection = new ArrayList<String>(); 

// Call add() method of List to add expected elements for selection. 
    expectedSelection.add("July"); 
    expectedSelection.add("May"); 
    expectedSelection.add("March"); 

// Iterating WebElement by using the advanced for loop to retrieve the actually selected elements and then add selected elements in the list using add() method. 
   List<String> actualSelection = new ArrayList<String>(); 
   for(WebElement element : multiplechoicelist.getAllSelectedOptions()) 
   { 
     actualSelection.add(element.getText()); // Here, getText() method of WebElement class has been used to add the text label of all the options in the list.
   } 
// Now compare actualSelection with expectedSelection by using containsAll() method to check that correct options are selected in the list.. 
   if(actualSelection.containsAll(expectedSelection)) 
   { 
      System.out.println(actualSelection); 
   } 
 driver.close(); 
 } 
}
