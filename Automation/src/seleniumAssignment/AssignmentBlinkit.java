package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentBlinkit {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/");
		driver.findElement(By.xpath("//p[text()='Blinkit']")).click();
		driver.findElement(By.xpath("//button[@class='btn location-box mask-button']")).click();
		driver.findElement(By.xpath("//div[text()='!']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("Cocacola");
		driver.findElement(By.xpath("(//div[text()='ADD'])[1]")).click();
		WebElement add = driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']"));
		for (int i = 0; i < 5; i++) {
			add.click();
		}
		driver.findElement(By.xpath("//div[@class='CartButton__Button-sc-1fuy2nj-5 joEvaa']")).click();
	}

}
