package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

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
		WebElement element = Driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select emp=new Select(element);
		emp.selectByIndex(4);
		WebElement element2 = Driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select auto=new Select(element2);
		auto.selectByVisibleText("Automobile");
		WebElement element3 = Driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select cop=new Select(element3);
		cop.selectByValue("OWN_CCORP");
	}

}
