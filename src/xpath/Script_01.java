package xpath;

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
		
		driver.get("file:///D:/Selenium_Notes/Xpath/Page_09.html");
		
		driver.findElement(By.xpath("./html/body/input[1]")).sendKeys("Neha");
		
		driver.findElement(By.xpath("./html/body/input[2]")).sendKeys("Dambe");
		
		driver.findElement(By.xpath("./html/body/input[3]")).sendKeys("Neha@8497");
		
		driver.findElement(By.xpath("./html/body/input[4]")).sendKeys("neha430@gmail.com");
		
		driver.findElement(By.xpath("./html/body/input[5]")).sendKeys("9075105511");
		
	}


}
