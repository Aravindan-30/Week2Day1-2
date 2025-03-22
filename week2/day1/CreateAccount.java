package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver Driver = new ChromeDriver();
	Driver.get("http://leaftaps.com/opentaps/");
	Driver.manage().window().maximize();
	Driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	Driver.findElement(By.id("password")).sendKeys("crmsfa");
	Driver.findElement(By.className("decorativeSubmit")).click();
	Driver.findElement(By.partialLinkText("CRM/SFA")).click();
	Driver.findElement(By.partialLinkText("Accounts")).click();
	Driver.findElement(By.partialLinkText("Create Account")).click();
	Driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
	Driver.findElement(By.id("numberEmployees")).sendKeys("100");
	Driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	Driver.findElement(By.className("x-btn-text")).click();
	String title = Driver.getTitle();
	System.out.println(title);
	Driver.close();
	}

}
