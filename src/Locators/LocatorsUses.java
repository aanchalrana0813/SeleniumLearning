package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsUses {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://modest-pasteur-2db493.netlify.app/");
		
		//Locating an element by its ClassName
		driver.findElement(By.className("btn-primary")).click(); 

	}

}
