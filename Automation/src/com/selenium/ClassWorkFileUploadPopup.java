package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkFileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("D:\\WhatsApp Image 2024-01-02 at 19.01.39_a400ff52.jpg");
		
		
	}

}
