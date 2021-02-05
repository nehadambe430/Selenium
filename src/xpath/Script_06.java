//XpathByAttribute
package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_06
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Selenium_Notes/Xpath/Page_09.html");
		
		driver.findElement(By.xpath(".//input[@type='text']")).sendKeys("Neha");
		
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("9874661122");
		
		
		
	}

}
