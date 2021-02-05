package browser_Handle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Browser
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver f=new FirefoxDriver();
		f.get("https://www.google.com/");
		f.get("https://www.facebook.com/");
		f.quit();
		
		
		
	}

}
