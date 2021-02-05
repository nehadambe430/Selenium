package demo_testng;

import org.apache.log4j.Priority;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_03
{
	
	//default value invocationcount = 1
	//default value priority =0
	//default value enable=true or (for enable invocation count=0)
	/*
	@Test(invocationCount=5)
	public void tc()
	{
		Reporter.log("Hey....", true);
		
	}*/
	
	@Test(priority=3)
	public void tc1()
	{
		Reporter.log("1 Hey....1", true);
		
	}
	
	@Test(priority=1)
	public void tc2()
	{
		Reporter.log("2 Hey....2", true);
		
	}
	
	@Test(priority=-2,invocationCount=3)
	public void tc3()
	{
		Reporter.log("3 Hey....3", true);
		
	}
	
	@Test(enabled=false)
	public void tc4()
	{
		Reporter.log("4 Hey....4", true);
		
	}
	
	@Test(dependsOnMethods="tc6")
	public void tc5()
	{
		Reporter.log("5 Hey....5", true);
		
	}
	
	@Test(dependsOnMethods= {"tc7","tc8"})
	public void tc6()
	{
		Reporter.log("6 Hey....6", true);
		
	}
	
	@Test
	public void tc7()
	{
		Reporter.log("7 Hey....7", true);
		
	}
	@Test
	public void tc8()
	{
		Reporter.log("8 Hey....8", true);
		
	}







}
