package seleniumAssignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowPopups {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/");
		WebElement SocialLink = driver.findElement(By.xpath("//h6[text()='Social links']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",SocialLink);
        driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[1]")).click();
        driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[2]")).click();
        driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[3]")).click();
        driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[4]")).click();
        driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[5]")).click();
      
        Set<String> allwindowId = driver.getWindowHandles();
        for (String id : allwindowId) {
        	 driver.switchTo().window(id);
        	 if(driver.getTitle().equals("Zomato | LinkedIn"))
        	 {
        		 System.out.println(driver.getTitle());
        	 }
        	 else {
        		 driver.close();
        	 }
        }

	}

}
