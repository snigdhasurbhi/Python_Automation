package inheritance;
class kolkata extends Pune
{
	static void w1()
	{
		System.out.println("1");
	}
	void w2()
	{		System.out.println("2");
		
	}	
}

public class Chennai extends kolkata {
	static void w7()
	{		System.out.println("3");
		
	}
	void w8()
	{
		System.out.println("4");
	}	
	public static void main(String[] args) {
		//
		w7();
		Chennai c1=new Chennai();
		c1.w8();
		w1();
		c1.w2();
		w3();
		c1.w4();
		Jaipur j1=new Jaipur();
		j1.w5();
		j1.w6();
		j1.w3();
		j1.w4();
	}

}
class Pune 
{static void w3()
{
	System.out.println("5");
}
void w4()
{
	System.out.println("6");
}	
	
}
class Jaipur extends Pune
{
	static void w5()
	{
		System.out.println("7");
	}
	void w6()
	{		System.out.println("8");
	}	
}