package listbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_07 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(6000);
		WebElement month_listbox = driver.findElement(By.id("month"));
		Select s=new Select(month_listbox);
		
		//Identify All options in month listbox
		List<WebElement> ref1 = s.getOptions();
		
		for(int i=0;i< ref1.size(); i++)
		{
			String option_text = ref1.get(i).getText();
			System.out.println(option_text);
		}
		System.out.println("**************************");
		
		ArrayList<String>  ref2=new ArrayList<String>();
		
		for(int i=0;i<ref1.size();i++)
		{
			String option = ref1.get(i).getText();
			ref2.add(option);
		}
		
		Collections.sort(ref2);
		
		for(int i=0;i<ref2.size();i++)
		{
			String text = ref2.get(i);
			System.out.println(text);
		}
		
	

	}

}
