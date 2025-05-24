package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) {
 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");  //Using Css Selector with Tagname and Id
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); 
		driver.findElement(By.cssSelector("button.submit")).click(); // using Css Selector with Tagname and Class

	}

}
