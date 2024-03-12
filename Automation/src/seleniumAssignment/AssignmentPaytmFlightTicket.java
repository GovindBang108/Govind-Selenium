package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPaytmFlightTicket {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://paytm.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.findElement(By.xpath("//div[2][@class='_2EGQY']")).click();	
	    driver.findElement(By.xpath("//span[@id='srcCity']")).click();
	    driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	    driver.findElement(By.xpath("//input[@id='text-box']")).sendKeys("Pune");
	    driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
	    driver.findElement(By.xpath("//span[@id='destCode']")).click();
	    driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	    driver.findElement(By.xpath("//input[@id='text-box']")).sendKeys("Ayodhya");
	    driver.findElement(By.xpath("//div[text()='Ayodhya, Uttar Pradesh, India']")).click();
	    driver.findElement(By.xpath("//span[@id='departureDate']")).click();
	    driver.findElement(By.xpath("(//div[text()='7'])[1]")).click();
	    driver.findElement(By.xpath("//button[@id='flightSearch']")).click();
	    driver.findElement(By.xpath("//button[@class='zHp8j']")).click();
	}
}
