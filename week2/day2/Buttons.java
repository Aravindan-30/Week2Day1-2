package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		//open chrome 
		ChromeDriver driver = new ChromeDriver();
		// open the url
		driver.get("https://leafground.com/button.xhtml");
		//Maximize the window
		driver.manage().window().maximize();
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		// Verify that the title of the page is ‘dashboard.’
		String title = driver.getTitle();
		System.out.println(title);
		// Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		// Find and print the position of the button with the text ‘Submit.’
		// Find and print the background color of the button with the text ‘Find the Save button color.’
		// Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		// Close the browser window
		driver.close();
	}

}
