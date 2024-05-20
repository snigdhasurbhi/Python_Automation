package automation1;

public class SIB 
{
static
	{
	System.out.println("Static Inialization Block");	
	}
{
	System.out.println("I am Instance Inialization Block");	
}
	
	public static void main(String[] args) 
	{
		System.out.println("I am main method");	
		SIB s1=new SIB();

	}
	SIB()
	{	
		System.out.println("I am constructor");	
	}

}
