package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassWorkHiddenDivisonPopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Govind Bang");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("govind108bang@gmail.com");
		
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='w-[97%] m-2 px-4 h-10 border-2 border-stone-600 rounded-md']")));
	    dropdown.selectByValue("Laptop");
		
	    driver.findElement(By.xpath("//textarea[@class='w-[97%] m-2 h-16 px-4 py-2 border-2 border-stone-600 rounded-md']")).sendKeys("It is Test Script");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
}
