package seleniumAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class AssignmentTakesScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://www.jiocinema.com/");
	        driver.findElement(By.xpath("//input[@type='text']")). sendKeys("Hanuman",Keys.ENTER);
	        Thread.sleep(10000);
	        RemoteWebDriver r = (RemoteWebDriver)driver;
	        File src = r.getScreenshotAs(OutputType.FILE);
	        File dest = new File("./screenshot/image2.png");
	        Files.copy(src, dest);
	}
}
