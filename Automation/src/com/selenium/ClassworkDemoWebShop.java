package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassworkDemoWebShop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("govind1008bang@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("GovindBang@108");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		driver.findElement(By.linkText("shopping cart")).click();
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		driver.findElement(By.id("CountryId")).click();
		WebElement dropdown = driver.findElement(By.id("CountryId"));
		Select s = new Select(dropdown);
		s.selectByValue("41");
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.id("BillingNewAddress_CountryId")).click();
		WebElement dropdown1 = driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select s1 = new Select(dropdown1);
		s1.selectByValue("41");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Amravati");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("Sakkarsath Chowk");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("444601");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']")).click();
		driver.findElement(By.xpath("//a[@class='account']")).click();
		driver.findElement(By.xpath("//a[text()='Orders']")).click();
		driver.findElement(By.xpath("//input[@class='button-2 order-details-button']")).click();
	}

}
