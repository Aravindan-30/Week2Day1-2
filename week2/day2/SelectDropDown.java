package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

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
		Driver.findElement(By.id("accountName")).sendKeys("SeleniumAutomationTester");
		WebElement element = Driver.findElement(By.name("industryEnumId"));
		Select indus = new Select(element);
		indus.selectByVisibleText("Computer Software");
		WebElement element2 = Driver.findElement(By.name("ownershipEnumId"));
		Select ownership =new Select(element2);
		ownership.selectByVisibleText("S-Corporation");
		WebElement element3 = Driver.findElement(By.id("dataSourceId"));
		Select source = new Select(element3);
		source.selectByValue("LEAD_EMPLOYEE");
		WebElement element4 = Driver.findElement(By.id("marketingCampaignId"));
		Select market =new Select (element4);
		market.selectByIndex(6);
		WebElement element5 = Driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(element5);
		state.selectByValue("TX");
		Driver.findElement(By.className("smallSubmit")).click();
		String title = Driver.getTitle();
		System.out.println(title);
		Driver.close();
	}

}
