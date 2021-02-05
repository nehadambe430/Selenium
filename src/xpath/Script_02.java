package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_02
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/Xpath/Page_10.html");
		
		driver.findElement(By.xpath("./html/body/div[1]/input[1]")).sendKeys("Neha");
		driver.findElement(By.xpath("./html/body/div[1]/input[2]")).sendKeys("Dambe");
		driver.findElement(By.xpath("./html/body/div[1]/input[3]")).sendKeys("NEHA@1234");
		driver.findElement(By.xpath("./html/body/div[2]/input[1]")).sendKeys("neha123@gmail.com");
		driver.findElement(By.xpath("./html/body/div[2]/input[2]")).sendKeys("9075105511");
		driver.findElement(By.xpath("./html/body/div[2]/a[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("./html/body/div[3]/input[1]")).sendKeys("India");
		driver.findElement(By.xpath("./html/body/div[3]/a[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("./html/body/div[3]/a[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("./html/body/div[4]/a[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("./html/body/div[4]/a[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("./html/body/div[4]/a[3]")).click();
		
	}

}
