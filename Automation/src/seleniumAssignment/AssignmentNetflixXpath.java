package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNetflixXpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.netflix.com/in/");
	driver.findElement(By.xpath("//a[@id = 'signIn']")).click();
	driver.findElement(By.xpath("//input[@name = 'userLoginId']")).sendKeys("govind108bang@gmail.com");
	driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("GovindBang108");
	driver.findElement(By.xpath("//button[text() = 'Sign In']")).click();
}
}
