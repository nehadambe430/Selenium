package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_05
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/Xpath/Page_10.html");
		
		//find password
		driver.findElement(By.xpath(".//input[3]")).sendKeys("12345jhgfh");;
		
		//link 5
		String s=driver.findElement(By.xpath(".//div[4]/a[2]")).getText();
		System.out.println(s);
		
		//firstname email country
		String s2=driver.findElement(By.xpath(".//div/input[1]")).getText();
		System.out.println(s2);
		
		//link 1,link 2,link4
		driver.findElement(By.xpath(".//div/a[1]"));
		
		
		
	}

}
