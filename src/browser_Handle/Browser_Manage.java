package browser_Handle;

import java.awt.Dimension;
import java.awt.*;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Manage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver w=new FirefoxDriver();
		w.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		w.navigate().to("https://www.facebook.com/");
		
		//title name
		String str=w.getTitle();
		System.out.println("Webpage Title= "+str);
		
		//currenturl
		String str1=w.getCurrentUrl();
		System.out.println("Current url = "+str1);
		
		Thread.sleep(1000);
		//set size
		org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(200, 100);
		//d=new org.openqa.selenium.Dimension(200, 100);
		//Dimension d=new Dimension(200, 300);
		w.manage().window().setSize(d);
		Thread.sleep(1000);
		
		//set position
		
		w.manage().window().setPosition(new Point (200,300));
		Thread.sleep(1000);
		// maximize screen
		w.manage().window().maximize();
		Thread.sleep(1000);
		
		//fullscreen
		w.manage().window().fullscreen();
		Thread.sleep(1000);
		w.quit();
		
		
		
		
	}

}
