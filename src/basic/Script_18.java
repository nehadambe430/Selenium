package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_18 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement usr=driver.findElement(By.id("txtUsername"));
		Dimension d=usr.getSize();
		int u_h=d.getHeight();
		int u_w=d.getWidth();
		
		Point p=usr.getLocation();
		int x=p.getX();
		int y=p.getY();
		
		System.out.println(u_h);
		System.out.println(u_w);
		System.out.println(x);
		System.out.println(y);

	
		driver.close();
	}

}
