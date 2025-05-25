package AdvanceLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegExExpression {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Aanchal Rana");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //	Regex using the the Css selector.
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();   // Regex using the Xpath
		

	}

}
