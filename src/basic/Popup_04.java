package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_04 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//a[@class='nav-link']")).click();
		
		driver.findElement(By.xpath("//a[text()='Start Selenium Practice']")).click();
		
		driver.findElement(By.xpath("//input[text()='enter-name']")).sendKeys("Neha");
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
	}

}
