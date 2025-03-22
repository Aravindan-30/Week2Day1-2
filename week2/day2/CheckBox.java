package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://leafground.com/checkbox.xhtml");
Thread.sleep(2000);
//click checkbox
driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
//click notification box
driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();
//select language
driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]")).click();
//select tristate checkbox
driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]")).click();
//click on toggle switch
driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
//select verify disable checkbox
driver.findElement(By.className("ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled")).click();
String title = driver.getTitle();
System.out.println(title);
	}

}
