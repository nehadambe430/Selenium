import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_05 
{
	public static void main(String[] args) throws InterruptedException
	{
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		By ref=By.className("LM6RPg");
		WebElement search=driver.findElement(ref);
		search.sendKeys("Iphone");
		
		Thread.sleep(2000);
		driver.findElement(By.className("vh79eN")).click();*/
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath(".//input[@class='LM6RPg']")).sendKeys("iphone x");
		//driver.findElement(By.xpath(".//button[@class='vh79eN']")).click();
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		
	}

}
