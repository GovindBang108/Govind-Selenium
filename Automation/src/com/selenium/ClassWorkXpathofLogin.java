package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkXpathofLogin {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[2]/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[3]/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[4]/a")).click();
	}

}
