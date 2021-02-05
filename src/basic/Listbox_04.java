package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox_04
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		//click on create account button
		
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		
		
		WebElement date_listbox = driver.findElement(By.id("day"));
		Select s1=new Select(date_listbox);
		s1.selectByVisibleText("8");
		
		WebElement month_listbox = driver.findElement(By.id("month"));
		Select s2=new Select(month_listbox);
		s2.selectByVisibleText("Apr");
		
		WebElement year_listbox = driver.findElement(By.id("year"));
		Select s3=new Select(year_listbox);
		s3.selectByVisibleText("1997");

	}

}
