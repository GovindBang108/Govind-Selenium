package com.selenium;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkSetPosition {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Point point = new Point (200,600);
		driver.manage().window().setPosition(point);
		driver.get("https://www.google.com");
	}

}
