package Adarsh.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Westpac {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, 30);
	

	driver.get("https://buggy.justtestit.org/");
	driver.manage().window().maximize();
	
//	Register an user 
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/register']")));
	driver.findElement(By.xpath("//a[@href='/register']")).click();
	driver.findElement(By.name("username")).sendKeys("MSD07");
	driver.findElement(By.name("firstName")).sendKeys("India");
	driver.findElement(By.name("lastName")).sendKeys("NZ");
	driver.findElement(By.id("password")).sendKeys("Zxcv@4321");
	driver.findElement(By.name("confirmPassword")).sendKeys("Zxcv@4321");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	Thread.sleep(3000);
	
	
//  Login using the credentials	
	
	driver.findElement(By.name("login")).sendKeys("MSD07");
	driver.findElement(By.name("password")).sendKeys("Zxcv@4321");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']")));
	driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	
	
//	Vote for a car
	
	driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/img/overall.jpg']")));
	driver.findElement(By.xpath("//img[@src='/img/overall.jpg']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/img/cars/spider.jpg']")));
	driver.findElement(By.xpath("//img[@src='/img/cars/spider.jpg']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']")));
	driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	
	
//  Sort the cars in alphabetical order and view the 2nd page by clicking next 
	 
	driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/img/overall.jpg']")));
	driver.findElement(By.xpath("//img[@src='/img/overall.jpg']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Make']")));
	driver.findElement(By.xpath("//a[text()='Make']")).click();
	Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn']")));
	driver.findElement(By.xpath("//a[@class='btn']")).click();
	Thread.sleep(5000);

	
//	User profile update
 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Profile']")));
	driver.findElement(By.xpath("//a[text()='Profile']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender")));
	driver.findElement(By.id("gender")).click();
	driver.findElement(By.id("gender")).sendKeys("Male");
	driver.findElement(By.id("age")).sendKeys("26");
	driver.findElement(By.id("address")).sendKeys("5/1225, New North road, Mt Albert, Auckland");
	driver.findElement(By.id("phone")).sendKeys("0220146641");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='hobby']")));
	driver.findElement(By.xpath("//select[@id='hobby']")).click();
	Select Hobby = new Select(driver.findElement(By.name("hobby")));
	Hobby.selectByVisibleText("Drawing");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	
//	Logout
 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
	driver.findElement(By.xpath("//a[text()='Logout']")).click();

	
	
	
	
	
}


	









	
	
	
	
}


