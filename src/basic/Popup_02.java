package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_02
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.id("AccLogin")).click();
		
		driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("9075105511");
		
		driver.findElement(By.xpath("//input[@id='chk_refer_code']")).click();
		
	}

}
