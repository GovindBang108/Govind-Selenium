package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClassWorkFlipKart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("ipad",Keys.ENTER);
		List<WebElement> ipadName = driver.findElements(By.xpath("//div[@class='_4rR']"));
		for(WebElement name :ipadName)
		{
			System.out.println(name.getText());
		}
		

	}

}
