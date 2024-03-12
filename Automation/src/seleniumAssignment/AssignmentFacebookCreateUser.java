package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFacebookCreateUser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Govind");
		driver.findElement(By.name("lastname")).sendKeys("Bang");
		driver.findElement(By.name("reg_email__")).sendKeys("govind108bang@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("govind108bang@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("govindbang108");
		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
	}

}
