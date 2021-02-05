//xpathByText
package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_08 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Selenium_Notes/Xpath/Page_11.html");
		
		driver.findElement(By.xpath(".//span[text()='TextMsg1']")).click();
		
		driver.findElement(By.xpath(".//span[text()]='      TextMsg2    '")).click();
		
	
		
	}

}
