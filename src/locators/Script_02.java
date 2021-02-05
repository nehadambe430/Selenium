package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_02
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		By ref1=By.id("email");
		WebElement rv1=driver.findElement(ref1);
		rv1.sendKeys("9075105511");
		
		By ref2=By.id("pass");
		WebElement rv2=driver.findElement(ref2);
		rv2.sendKeys("Neha@8497");
		
		By ref3=By.id("u_0_b");
		WebElement rv3=driver.findElement(ref3);
		rv3.click();
	
		
	}

}
