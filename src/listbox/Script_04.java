package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_04
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		//click on create account button
		
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		
		//Selct DOB 14th Aug 1992
		WebElement date_listbox = driver.findElement(By.id("day"));
		Select s1=new Select(date_listbox);
		s1.selectByVisibleText("10");
		
		WebElement month_listbox = driver.findElement(By.id("month"));
		Select s2=new Select(month_listbox);
		s2.selectByVisibleText("Aug");
		
		WebElement year_listbox = driver.findElement(By.id("year"));
		Select s3=new Select(year_listbox);
		s3.selectByVisibleText("1992");

	}

}
