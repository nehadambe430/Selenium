package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_03 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		/*
		Options o= driver.manage();
		
		Dimension d=new Dimension(200, 300);
		
		o.window().setSize(d);*/
		
		Dimension d =new Dimension(200, 300);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		
		Point p =new Point(200, 300);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.manage().window().fullscreen();
		
		driver.get("https://www.flipkart.com/");
		//driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
