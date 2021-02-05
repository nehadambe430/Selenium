package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_04 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Selenium_Notes/Xpath/Page_09.html");
		
		driver.findElement(By.xpath(".//input[1]")).sendKeys("Neha");
		driver.findElement(By.xpath(".//input[2]")).sendKeys("Dambe");
		driver.findElement(By.xpath(".//input[3]")).sendKeys("Neha@123");
		driver.findElement(By.xpath(".//input[4]")).sendKeys("nehadambe430@gmail.com");
		driver.findElement(By.xpath(".//input[5]")).sendKeys("9075105511");
		
		
		
	}

}
