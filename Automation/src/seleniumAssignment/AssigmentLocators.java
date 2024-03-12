package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement Usernametextfield = driver.findElement(By.id("email"));
		Usernametextfield.sendKeys("9767279081");
		WebElement Passwordtextfield = driver.findElement(By.name("pass"));
		Passwordtextfield.sendKeys("1234554321");
		WebElement Loginbutton = driver.findElement(By.name("login"));
		Loginbutton.click();
		
	}

}
