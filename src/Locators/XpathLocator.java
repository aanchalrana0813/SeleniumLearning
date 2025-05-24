package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("rahul");  //Using Xpath
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); 
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // using Xpath


	}

}
