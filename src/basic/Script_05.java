package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_05 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in/");
		driver.get("https://www.myntra.com/");
		driver.get("https://www.flipkart.com/");
		
		String exp_page="facebook";
		
		while(true)
		{
			String title=driver.getTitle();
			if(title.contains(exp_page))
			{
				break;
			}
			else
			{
				driver.navigate().back();
			}
		}
		
	}

}
