package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_16 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#skills");
		//Identify Checkbox
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		//click on checkbox
		checkbox.click();
		//verify checkbox selected or not
		boolean value= checkbox.isSelected();
		if(value)
		{
			System.out.println("Checkbox Selected");
		}
		else
		{
			System.out.println("Checkbox not selected");
		}
		Thread.sleep(5000);
		//deselect checkbox
		checkbox.click();
		//verify checkbox deselected
		boolean value1 = checkbox.isSelected();//false
		if(value1)
		{
			System.out.println("Checkbox not deselected");
		}
		else
		{
			System.out.println("Checkbox Deselected");
		}
		
		
		
		
		
		
	}

}
