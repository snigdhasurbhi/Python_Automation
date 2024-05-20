package automation1;

public class Global_Intance_variable
{
	int a=10;  // nonstatic 
	static int b=100;
	public static void main(String[] args) 
	{
	System.out.println(b);
	Global_Intance_variable G1= new Global_Intance_variable(); // we have created object for calling nonstatic variable
	//G1.a;
	
	System.out.println(G1.a);


	}

}
