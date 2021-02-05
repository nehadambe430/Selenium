package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_09 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/Xpath/Page_11.html");
		
		driver.findElement(By.xpath(".//span[contains (@id,'stable')]"));
		
		driver.findElement(By.xpath(".//span[contains (text(),'TextMsg3')]"));
		
		driver.findElement(By.xpath(".//span[contains (text(),'Textmsg3')]"));
		
		
		
	}

}
