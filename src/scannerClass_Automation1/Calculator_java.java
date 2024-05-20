package scannerClass_Automation1;

import java.util.Scanner;

public class Calculator_java {
	 /* static  int a,  b;  static int add = a+b;  static int mul = a*b;  static int sub =a-b;  static double divide=a/b; 
	static  double mod=a%b; */
	public static void main(String[] args) {
		  int a; int b;  /* int add = a+b;   int mul = a*b;   int sub =a-b;  double divide=a/b; 
		  double mod=a%b; */
		
		  Scanner S1= new Scanner(System.in);

System.out.println("Enter the value of A");
a = S1.nextInt();
System.out.println("Enter the value of B");
b= S1.nextInt();
// System.out.println("Which operation you want to execute 1 = add, 2= mul, 3= sub, 4= divide and 5 = mod");

  int add = a+b;
// add = S1.nextInt();
  System.out.println (" the value of Add" + add);
  

  int mul = a*b; 
  System.out.println (" the value of mul" +  mul);
  int sub =a-b;
  System.out.println (" the value of sub" +  sub);
  
  double divide=a/b; 
  System.out.println (" the value of divide" +  divide);
  
  double mod=a%b;
  System.out.println (" the value of mod" +  mod);
  

		
	}

}
