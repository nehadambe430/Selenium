package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class velocity_dropdown 
{
	public static void main(String[] args) throws AWTException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		 WebElement a = driver.findElement(By.id("dropdown-class-example"));
		/*
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		*/
		
		 a.click();
		 
		Select s=new Select(a);
		List<WebElement> opt = s.getOptions();
		
		for(int i=0;i<=opt.size();i++)
		{
			 WebElement w=opt.get(i);
			 String o=w.getText();
			 System.out.println(o);
			 
		}
	}

}
