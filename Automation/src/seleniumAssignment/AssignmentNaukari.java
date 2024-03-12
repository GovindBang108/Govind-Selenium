package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNaukari {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mickey Roy");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Govind1008bang@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mickey@108");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//div[2][@class='focusable optionWrap  ']")).click();
		driver.findElement(By.xpath("//input[@name='currentCity']")).sendKeys("Pune");
		driver.findElement(By.xpath("//li[@value='a139']")).click();
		driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
