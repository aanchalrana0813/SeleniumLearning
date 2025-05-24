package AdvanceLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlidingScreens {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(5000); // Gives the time to slide the screen , to make other elements visible
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Aanchal Rana");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("aanchalannu02@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9988776655");
		driver.findElement(By.className("reset-pwd-btn")).click();

		

	}

}
