package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_07 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Selenium_Notes/HTML_01/neha.html");
		//and
		driver.findElement(By.xpath(".//input[@type='text' and @id='last']")).sendKeys("Dambe");
	//or
		driver.findElement(By.xpath(".//input[@type='text' or @id='first']")).sendKeys("neha");
		
		
		driver.findElement(By.xpath(".//input[@type='text' and @id='email']")).sendKeys("neha@gmail.com");
	}

}
