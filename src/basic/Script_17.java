package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_17 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#skills");
		//Identify Checkbox
		
		WebElement check=driver.findElement(By.id("checkBoxOption2"));
		check.click();
		
		boolean status=check.isSelected();
		
		if(status)
		{
			System.out.println("Checkbox selected");
		}
		else
		{
			System.out.println("Checkbox Deselected");
		}
		
		Thread.sleep(2000);
		check.click();
		

		if(status)
		{
			System.out.println("Checkbox selected");
		}
		else
		{
			System.out.println("Checkbox Deselected");
		}
		
		driver.close();
		
	}

}
