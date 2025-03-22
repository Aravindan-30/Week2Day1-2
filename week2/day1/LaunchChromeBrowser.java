package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("http://facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Tuna@321");
driver.findElement(By.name("login")).click();
String title = driver.getTitle();
System.out.println(title);
	}

}
