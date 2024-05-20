package automation1;

public class Method_calling_other_method {
int a, b, c, d;
	public static void main(String[] args) {
		
		Method_calling_other_method M1= new Method_calling_other_method();  // created object for calling non static variable
		M1.Add(); // callled  non static method 
		M1.Mul();
	}

	 void   Add ()
	{
		int a= 75; int b= 50;  int c= a+b;
		System.out.println("performing add operation");
		System.out.println(c); 
		Mul();
		Sub();
		div();	
		
	}
	 void   Mul ()
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
	 
	 void   div ()
		{
			int a= 75; int b= 50;  int c= a/b;
			System.out.println("performing div operation");
			
			System.out.println(c); 
		}
	 
	 
	 
}


