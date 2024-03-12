package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentInstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		WebElement Usernametextfield = driver.findElement(By.name("username"));
		Usernametextfield.sendKeys("9767279081");
		WebElement Passwordtextfield = driver.findElement(By.name("password"));
		Passwordtextfield.sendKeys("9767279081");
		WebElement Loginbutton = driver.findElement(By.className("_acap"));
		Loginbutton.click();
		
	}

}
