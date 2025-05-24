package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");  //Loacting an element by its Id
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); //Locating element by its Name
		
		//Locating an element from its Class Name
		driver.findElement(By.className("signInBtn")).click();
	}

}
