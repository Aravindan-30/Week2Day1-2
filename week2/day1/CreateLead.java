package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.partialLinkText("CRM/SFA")).click();
		Driver.findElement(By.partialLinkText("Leads")).click();
		Driver.findElement(By.partialLinkText("Create Lead")).click();
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravindan");
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Srivatsan");
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TeastLeaf");
		Driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Automation Tester");
		Driver.findElement(By.name("submitButton")).click();
		String title = Driver.getTitle();
		System.out.println(title);
		Driver.close();
		}
}
