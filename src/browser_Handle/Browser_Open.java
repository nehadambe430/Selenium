package browser_Handle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Browser_Open
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.google.com/");
		c.close();
			
	}

}
