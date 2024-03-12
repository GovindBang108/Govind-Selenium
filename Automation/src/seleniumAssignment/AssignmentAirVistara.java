package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAirVistara {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='acceptAllBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("pune");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Pune']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='flightSearchTo']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("Delhi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Delhi']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[text()='2'])")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[text()='3'])")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
      
		
	}

}
