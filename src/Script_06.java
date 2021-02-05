import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_06 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/Locaters/Page_05.html");
		driver.findElement(By.id("google")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("facebook")).click();
		
		
		
	}

}
