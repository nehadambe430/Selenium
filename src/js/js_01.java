package js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class js_01 
{
	public static void main(String[] args) throws InterruptedException
	{//open Browser page
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//Open Actitime App
		driver.get("http://localhost/login.do");
		//Login to Actitime
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(8000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByTagName('a')[1].click()");
		

	}
	

}
