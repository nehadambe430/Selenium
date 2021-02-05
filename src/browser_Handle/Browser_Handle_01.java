package browser_Handle;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Handle_01
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver c=new ChromeDriver();
		c.manage().window().fullscreen();
		c.get("https://www.google.com/");
		
		c.get("https://www.facebook.com/");
		c.navigate().back();
		c.navigate().forward();
		c.get("https://www.amazon.in/");
		
		String str = c.getTitle();
		System.out.println("Title: "+str);
		
		
		String str1 = c.getCurrentUrl();
		System.out.println("Current URL:"+str1);
		
		Dimension d=new Dimension(500, 400);
		c.manage().window().setSize(d);
		
		org.openqa.selenium.Point p =new org.openqa.selenium.Point(500, 400);
		c.manage().window().setPosition(p);
		
		c.navigate().refresh();
		
		c.manage().window().getSize();
		c.quit();
		
		
		
		
	}

}
