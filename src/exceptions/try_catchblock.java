package exceptions;

public class try_catchblock {

	public static void main(String[] args) {
		// 
		
	//	int a= 1/0;
	//	System.out.println(a);
		
			try
			{
				int a=1/0;
				int b=0/1;
			}
			catch(ArithmeticException a1)
			{
				System.out.println("Handled Exception");
			}
			finally
			{
				System.out.println("No matter what i will execute");
			}  

		}

	}
