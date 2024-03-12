package com.selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{
    public static void main(String[] args) 
    {
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.airvistara.com/in/en");
        String actual_title = driver.getTitle();
        String expected_title = "Book Flights & Check In Online | Vistara"; 
        
        if (actual_title.equals(expected_title))
        {
            System.out.println("Test Case is Pass");
        }
        else
        {
            System.out.println("Test Case is Fail");	
        }
    }
}

	


