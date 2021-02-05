package basic;
//xpath by attribute
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.className("nav-icon nav-arrow null")).click();
		
		//driver.findElement(By.xpath(".//a[@class='nav-a']")).click();
		
		driver.findElement(By.id("nav-link-accountList")).click();
		
		driver.findElement(By.xpath(".//a[@id='createAccountSubmit']")).click();
		
		driver.findElement(By.xpath(".//input[@id='ap_customer_name']")).sendKeys("Neha");
		
		driver.findElement(By.xpath(".//input[@type='tel']")).sendKeys("9075105511");
		
		driver.findElement(By.xpath(".//input[@id='ap_email']")).sendKeys("neha@gmail.com");
		
		driver.findElement(By.xpath(".//input[@id='ap_password']")).sendKeys("Neha@1234");
		
		driver.findElement(By.xpath(".//a[@class='a-link-emphasis']")).click();
		
		driver.findElement(By.xpath(".//a[@id='createAccountSubmit']")).click();
	}

}
