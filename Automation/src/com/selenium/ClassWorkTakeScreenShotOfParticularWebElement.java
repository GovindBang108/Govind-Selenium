package com.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ClassWorkTakeScreenShotOfParticularWebElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     driver.get("https://www.bluestone.com/");
	     driver.findElement(By.xpath("//span[@class='confirm-btn']")).click();
	     WebElement goldCoin = driver.findElement(By.xpath("//a[text()=\"Gold Coins \"]"));
	     Actions act = new Actions(driver);
	     act.moveToElement(goldCoin);
	     goldCoin.click();
	     WebElement coin = driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']"));
	     Thread.sleep(5000);
	     File src = coin.getScreenshotAs(OutputType.FILE);
	     File dest = new File("./screenshot/coin.png");
	     Files.copy(src, dest);
	}

}
