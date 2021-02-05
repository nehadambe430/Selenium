import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_17 

{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/Locaters/Page_06.html");
		
		WebElement username=driver.findElement(By.id("user"));
		
		boolean status=username.isEnabled();
		
		if(status)
		{
			System.out.println("username field enabled");
			username.clear();
		}
		else
		{
			System.out.println("username field disabled");
		}
		
	}

}
