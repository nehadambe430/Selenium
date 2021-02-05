package browser_Handle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Navigation 
{
	public static void main(String[] args) throws InterruptedException
	{
		/*
		WebDriverManager.chromedriver().setup();
		WebDriver c=new ChromeDriver();
		c.get("https://www.google.com/");
		c.get("https://www.facebook.com/");
		WebDriver c1=new ChromeDriver();
		c1.get("https://www.naukri.com/");
		c.quit();
		c1.quit();*/
		
		//by using navigate interface
		
		WebDriverManager.chromedriver().setup();
		WebDriver w=new ChromeDriver();
		w.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		w.navigate().to("https://www.facebook.com/");
		
		w.navigate().to("https://www.naukri.com/");
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
		w.navigate().forward();
		Thread.sleep(2000);
		w.navigate().refresh();
		w.quit();
		//w.close();
		
		
		
		
		
		
	}

}
