package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_04 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		String s1=driver.getTitle();
		String s2="google";
		
		boolean status=s2.equalsIgnoreCase(s1);
		
		if(status)
		{
			System.out.println("Google page displayed");
		}
		else
		{
			System.out.println("google page is not displayed");
		}
	}

}
