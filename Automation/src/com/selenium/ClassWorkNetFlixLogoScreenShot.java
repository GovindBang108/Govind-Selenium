package com.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ClassWorkNetFlixLogoScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     driver.get("https://www.netflix.com/");
	     WebElement Logo = driver.findElement(By.xpath("//span[@class='default-ltr-cache-0 ev1dnif0']"));
	     Thread.sleep(5000);
	     File src = Logo.getScreenshotAs(OutputType.FILE);
	     File dest = new File("./screenshot/Netflix.png");
	     Files.copy(src, dest);
	}
}
