package demo_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemoReadDatap
{
	@Test(dataProvider="demo",dataProviderClass=demo_testng.DemoReadDatap.class)
	public void tc1(String user,String pass)
	{
		Reporter.log(user+ " "+pass,true);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).sendKeys(pass,Keys.ENTER);
		
		
		WebDriverWait ww=new WebDriverWait(driver,10);
		ww.until(ExpectedConditions.titleContains("Enter"));
		
	}

}
