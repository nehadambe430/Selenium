package demo_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_04 
{
	@Test(groups="smoke",priority=3)
	public void tc1()
	{
		Reporter.log("1 Hey....1", true);
		
	}
	
	@Test(groups="regrasion",dependsOnGroups="functinal")
	public void tc2()
	{
		Reporter.log("2 Hey....2", true);
		
	}
	
	@Test(groups="functional",dependsOnGroups="smoke",priority=2)
	public void tc3()
	{
		Reporter.log("3 Hey....3", true);
		
	}
	
	@Test(groups="smoke",priority=2)
	public void tc4()
	{
		Reporter.log("4 Hey....4", true);
		
	}
	
	@Test(groups="functional",dependsOnGroups="smoke",priority=-3)
	public void tc5()
	{
		Reporter.log("5 Hey....5", true);
		
	}
	@Test(groups="smoke",priority=1)
	public void tc6()
	{
		Reporter.log("6 Hey....6", true);
		
	}
	
	@Test(groups="functional",dependsOnGroups="smoke")
	public void tc7()
	{
		Reporter.log("7 Hey....7", true);
		
	}


}
