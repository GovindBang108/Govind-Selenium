package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkActitimeWithXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=1uq5zohrexvo6");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("GovindBang");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("GovindBang@108");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("GovindBang@108");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("GovindBangBhai");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("GovindBangBhai");
		driver.findElement(By.xpath("//input[contains(@value , ' Create User ')]")).click();
		}

}
