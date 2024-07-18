package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependsOnMethod 
{
	@Test(priority=1, invocationCount = 2)
	void openapp()
	{
      Assert.assertEquals(1,1); 
	}

	//@Test(priority=2, dependsOnMethods = {"openapp"}, alwaysRun = true)
	void login()
	{
	      Assert.assertTrue(true);

	}

	//@Test(priority=3,dependsOnMethods = {"login"})
	void search()
	{
	      Assert.assertTrue(true);

	}
	
	//@Test(priority=4,dependsOnMethods = {"login", "search"})
	void advSearch()
	{
	      Assert.assertTrue(true);

	}

	//@Test(priority=5)
	void logout()
	{
	      Assert.assertTrue(true);

	}
}
