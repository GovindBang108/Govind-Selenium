package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkXpathAdvance{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class = 'ico-register']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class = 'ico-login']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class = 'ico-cart']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class = 'ico-wishlist']")).click();
		
		
		
	}
	

}
