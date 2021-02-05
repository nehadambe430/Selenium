import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_21
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Identify Username and password field
		WebElement un = driver.findElement(By.id("txtUsername"));
		WebElement pwd = driver.findElement(By.id("txtPassword"));
		
		int un_h=un.getSize().getHeight();
		int un_x=un.getLocation().getX();
		int un_y=un.getLocation().getY();
		
		int space=4;
		
		int total=un_h+un_y+space;
		
		int pwd_x=pwd.getLocation().getX();
		int pwd_y=pwd.getLocation().getY();
		
		if(un_x==pwd_x && pwd_y >= total)
		{
			System.out.println("Password field aligned below username field");
		}
		else
		{
			System.out.println("Password field not aligned below username field");
		}
		


		
	}

}
