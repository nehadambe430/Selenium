package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox_07 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath(".//a[@id='u_0_2']")).click();

		WebElement month_listbox = driver.findElement(By.id("month"));
		Select s=new Select(month_listbox);
		List<WebElement> all_option = s.getOptions();

		for(int i=0;i<all_option.size();i++)
		{
			String option_text=all_option.get(i).getText();
			System.out.println(option_text);
		}

		ArrayList<String>  ref2=new ArrayList<String>();

		for(int i=0;i<all_option.size();i++)
		{
			String option = all_option.get(i).getText();
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
