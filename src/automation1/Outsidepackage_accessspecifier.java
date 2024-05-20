package automation1;

public class Outsidepackage_accessspecifier {

	static public  void   Add ()
	{
		int a= 75; int b= 50;  int c= a+b;
		System.out.println("performing add operation");
		System.out.println(c); 
	/*	Mul();
		Sub();
		div();	
		mod(); */
		
	}
	private  void   Mul ()
		{
			int a= 75; int b= 50;  int c= a*b;
			System.out.println("performing mul operation");		
			System.out.println(c); 
		} 
	 
	 void   Sub()
		{
			int a= 75; int b= 50;  int c= a-b;
			System.out.println("performing sub operation");
			System.out.println(c); 
		}
	 
	protected  void   div ()
		{
			int a= 75; int b= 50;  int c= a/b;
			System.out.println("performing div operation");
			
			System.out.println(c); 
		}

	  public   void   mod ()
	{
		int a= 75; int b= 50;  int c= a%b;
		System.out.println("performing mod operation");
		
		System.out.println(c); 
	}

}
