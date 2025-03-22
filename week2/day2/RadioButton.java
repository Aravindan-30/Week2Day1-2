package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver Driver = new ChromeDriver();
Driver.get("https://www.leafground.com/radio.xhtml");
Driver.manage().window().maximize();
Driver.findElement(By.xpath("//span[@class='ui-helper-hidden-accessible']")).isSelected();
Thread.sleep(2000);
//Driver.close();
	}

}
