package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_06 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver rv =new FirefoxDriver();
		
		rv.get("https://www.google.com/");
		Thread.sleep(3000);
		
		Dimension d =new Dimension(200, 300);
		rv.manage().window().setSize(d);
		Thread.sleep(3000);
		
		rv.manage().window().maximize();
		Thread.sleep(3000);
		
		rv.get("https://www.facebook.com/");
		String actual_page=rv.getTitle();
		String exp_page="facebook";
		boolean status=exp_page.equalsIgnoreCase(actual_page);
		if(status)
		{
			System.out.println("Facebook page is Displayed");
		}
		else
		{
			System.out.println("Facebook page is not displayed");
		}
		
		Thread.sleep(3000);
		rv.navigate().back();
		
		System.out.println(rv.getTitle());
		Thread.sleep(3000);
		rv.navigate().forward();
		
		System.out.println(rv.getCurrentUrl());
		Thread.sleep(3000);
		rv.navigate().refresh();
		
		Thread.sleep(3000);
		
		Point p =new Point(400, 700);
		rv.manage().window().setPosition(p);
		Thread.sleep(3000);
		
		rv.manage().window().fullscreen();
		rv.quit();
		
	}

}
