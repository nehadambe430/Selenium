import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_19
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement un=driver.findElement(By.id("txtUsername"));
		
		WebElement pwd=driver.findElement(By.id("txtPassword"));
		
		int un_h=un.getSize().getHeight();
		
		int un_w=un.getSize().getWidth();
		
		int pwd_h=un.getSize().getHeight();
		
		int pwd_w=un.getSize().getWidth();
		
		if(un_h==pwd_h && un_w==pwd_w)
		{
			System.out.println("username and password field are same");
		}
		else
		{
			System.out.println("not same");
		}
		
	}

}
