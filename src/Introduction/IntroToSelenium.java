package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntroToSelenium {

	public static void main(String[] args) {
		
		// This is the program to introduce the object driver to implements the functions on the browsers
		
		
		WebDriver driver = new ChromeDriver(); // Implements all the Web and Chrome Methods
		
		// WebDriver driver1 = new FirefoxDriver();// Implements all Web and Firefox Methods
		
		driver.get("https://modest-pasteur-2db493.netlify.app/"); // to open any link 

		

	}

}
