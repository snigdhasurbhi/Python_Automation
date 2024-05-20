package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First_TestNG {

	@BeforeSuite
	
	public void sub()
	{
		System.out.println("sub");		
		}
	@BeforeTest
	
	public void mul()
	{
		System.out.println("sub");	
			
		}
	@BeforeClass
	public void home()
	
	{
		System.out.println("sub");	
			
		}
	@BeforeMethod
	
public void home1()
	
	{
		System.out.println("sub");	
			
		}
	
	@Test

public void add()
{
	System.out.println("hello");	
		
	}
	


}
