import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
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
		
		WebElement username =driver.findElement(By.id("txtUsername"));
		
		Dimension d= username.getSize();
		int unheight=d.getHeight();
		int unwidth=d.getWidth();
		
		System.out.println("Username field height is "+unheight);
		System.out.println("Username Field width is "+unwidth);
		
		
		Point p=username.getLocation();
		int un_xloc=p.getX();
		int un_yloc=p.getY();
		System.out.println("Username field xloc "+un_xloc);
		System.out.println("Username field yloc "+un_yloc);
		
		
		Rectangle r=username.getRect();
		int un_h=r.getHeight();
		int un_w=r.getWidth();
		int un_x=r.getX();
		int un_y=r.getY();
		
		System.out.println("Username field height is "+un_h);
		System.out.println("Username Field width is "+un_w);
		System.out.println("Username field xloc "+un_x);
		System.out.println("Username field yloc "+un_y);
		
		
		

		
		
	}

}
