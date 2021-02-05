package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_01 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/HTML_01/list.html");
		
		//identify listbox
		driver.findElement(By.id("subj")).click();
		
		//select list box
		driver.findElement(By.xpath(".//option[text()='JAVA']")).click();
		
	}

}
