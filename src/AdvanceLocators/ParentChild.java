package AdvanceLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild{

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("div.forgot-pwd-container")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("Aanchal"); //child through the Css selector
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Aanchal@gmail.com");  //Traversing through Xpath
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9988776655");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		

	}

}
