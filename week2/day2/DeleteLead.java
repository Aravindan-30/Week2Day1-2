package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        //enter username
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        //enter pass
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        //click login btn
        driver.findElement(By.className("decorativeSubmit")).click();
        //click crm/sfa link
        driver.findElement(By.partialLinkText("CRM")).click();
        //click lead link
        driver.findElement(By.partialLinkText("Leads")).click();
        //click find leads
        driver.findElement(By.partialLinkText("Find")).click();
        //click on phn tab
        driver.findElement(By.linkText("Phone")).click();
        //enter phn no.
        driver.findElement(By.name("phoneNumber")).sendKeys("123");
        //click find leads
        driver.findElement(By.className("x-btn-text")).click();
        //select the first member
        driver.findElement(By.className("linktext")).click();
        //delete the member
        driver.findElement(By.linkText("Delete")).click();
        //find leads
        driver.findElement(By.partialLinkText("Find")).click();
        //enter the id
        driver.findElement(By.name("id")).sendKeys("10392");
        //click find leads btn
        driver.findElement(By.partialLinkText("Find")).click();
        //close
        driver.close();
	}

}
