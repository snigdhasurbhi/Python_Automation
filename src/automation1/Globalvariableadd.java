package automation1;

public class Globalvariableadd {
  static int a,b ; // global static  variable
  static int c;
	public static void main(String[] args) {
		
		Globalvariableadd G1 = new Globalvariableadd();
		G1.add();
		
	 //int c= add();  //sir can we call assign value of non satic method to static variable.
 System.out.println("add is ="+c);
	}
int add()
{
	a=20; b=30;
	return a+b;
}
}
