package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		//open chrome driver
		ChromeDriver Driver = new ChromeDriver();
		//get the url
        Driver.get("http://leaftaps.com/opentaps/");
        //mazimize the browser
        Driver.manage().window().maximize();
        //Enter the Username as "DemoSalesManager" and the Password as "crmsfa".
        Driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        Driver.findElement(By.id("password")).sendKeys("crmsfa");
        //Click on the Login Button.
        Driver.findElement(By.className("decorativeSubmit")).click();
        // Click on the CRM/SFA Link.
        Driver.findElement(By.partialLinkText("CRM")).click();
        //Click on the Leads Button.
        Driver.findElement(By.linkText("Leads")).click();
        //Click on Create Lead.
        Driver.findElement(By.partialLinkText("Create")).click();
        //Enter the CompanyName Field Using Xpath.
        Driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
        //Enter the FirstName Field Using Xpath.
        Driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Aravindan");
        //Enter the LastName Field Using Xpath.
        Driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Srivatsan");
        //Enter the FirstName (Local) Field Using Xpath.
        Driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Arav");
        //Enter the Department Field Using any Locator of Your Choice.
        Driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
        //Enter the Description Field Using any Locator of your choice.
        Driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium");
        //Enter your email in the E-mail address Field using the locator of your choice.
        Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arav123@gmail.com");
        //Select State/Province as NewYork Using Visible Text.
        WebElement element = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select state = new Select(element);
        state.selectByVisibleText("Texas"); 
        // Click on the Create Button.
        Driver.findElement(By.className("smallSubmit")).click();
        //Click on the edit button.
        Driver.findElement(By.linkText("Edit")).click();
        //Clear the Description Field.
        Driver.findElement(By.id("updateLeadForm_description")).clear();
        //Fill the Important Note Field with Any text.
        Driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Fill the mandatory fields");
        //Click on the update button.
        Driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
        //Get the Title of the Resulting Page.
        String title = Driver.getTitle();
        System.out.println(title);
        //Close the browser window
        Driver.close();
	}

}
