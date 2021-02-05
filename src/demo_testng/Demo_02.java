package demo_testng;


import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_02 
{
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("Before Suit");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeC()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeM()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void tc()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void tc1()
	{
		System.out.println("Hiii...........");
	}
	
	@AfterMethod
	public void afterM()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterC()
	{
		System.out.println("After class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Ttest");
	}
	
	@AfterSuite
	public void afterSuit()
	{
		System.out.println("After Suit");
	}


}
