package seleniumAssignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[]args) {
    //Launch Browser
	WebDriver driver = new ChromeDriver();
    //Maximize Browser
    driver.manage().window().maximize();
    //Launch Web Application 
    driver.get("https://paytm.com/");
    //Current Url
    String actual_Url = driver.getCurrentUrl();
    // Expected Url
    String expected_Url = "https://paytm.com/";
    // 
    String actual_title = driver.getTitle();
    
    String expected_title = "Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
   
    if (actual_Url.equals(expected_Url))
    {
        System.out.println("Test Case is Pass");
    }
    
    else
    {
        System.out.println("Test Case is Fail");	
    }
    
    if (actual_title.equals(expected_title))
    {
        System.out.println("Test Case is Pass");
    }
   
    else
    {
        System.out.println("Test Case is Fail");	
    }
    driver.close();    
	}
}
 