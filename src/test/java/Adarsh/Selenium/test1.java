package Adarsh.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://buggy.justtestit.org/");
	driver.manage().window().maximize();
//	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@href='/register']")).click();
	driver.findElement(By.name("username")).sendKeys("AdarRama123");
	driver.findElement(By.name("firstName")).sendKeys("Adarsh");
	driver.findElement(By.name("lastName")).sendKeys("Ramasubramanian");
	driver.findElement(By.id("password")).sendKeys("Asdf@1234");
	driver.findElement(By.name("confirmPassword")).sendKeys("Asdf@1234");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();



	

	
	
	
	
}

}
