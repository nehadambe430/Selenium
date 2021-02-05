package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_29 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		driver.findElement(By.xpath(".//input[@type='submit']")).click();
		
		String m=driver.findElement(By.xpath(".//span[contains(text(),'empty')]")).getText();
		
		String n=driver.findElement(By.xpath(".//span[starts-with(text(),'U')]")).getText();
		
		String p=driver.findElement(By.xpath(".//span[starts-with(@id,'spanMessage')]")).getText();
		System.out.println(m);
		System.out.println(n);
		System.out.println(p);
	}

}
