package browser_Handle;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Manager_1 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.google.com/");
		c.get("https://www.facebook.com/");
		c.get("https://www.instagram.com/");
		c.get("https://www.amazon.com/");
		c.get("https://www.flipkart.com/");
		c.get("https://www.snapdeal.com/");
		String exp_title="facebook";
		
		while(true)
		{
			String title=c.getTitle();
			if(title.contains(exp_title))
			{
				c.quit();
				break;
			}
			else
			{
				c.navigate().back();
			}
		}
		
		
	}

}
