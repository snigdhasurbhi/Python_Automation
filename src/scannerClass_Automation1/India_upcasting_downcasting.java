package scannerClass_Automation1;
class AP{
	 void  Studen1() {

		System.out.println(" Student 1 ");	
	}
	 void std2() {
		 System.out.println(" Student apply ");	
	 }
}
class UP extends AP{
	 void  Studen2() {

			System.out.println(" UP ");	
		}
	 void  StudenPerformance () {

			System.out.println(" UP is state ");	
		}
}
class Bihar extends UP{
	 void  Studen3() {

			System.out.println(" Bihar ");	
		}
}

public class India_upcasting_downcasting extends Bihar {
void s5() {
	System.out.println(" s5 ");	
}
	public static void main(String[] args) {
		// 
UP u1 =new Bihar();  // what we did we upcasted(convert subclass object  to superclass type  ) from bihar to up 
u1.Studen2();
u1.Studen1();
u1.std2();
u1.StudenPerformance();
// u1.studen3();    this is not able to call 

Bihar B1 = (Bihar) u1 ;  // downcasting (convert super class object  to subclass type  )  from up to bihar
B1.Studen1();
B1.Studen2();
B1.Studen3();
B1.StudenPerformance();
B1.std2();
// B1.s5(); this undefind for bihar 
	}

}






/*Sirs programm
 * 
 * package package1;
class AP
{
	void s1() {
		System.out.println("s1");
	}
	void s2() {
		System.out.println("s2");
	}	
}
class UP extends AP
{
	static void s3() {
		System.out.println("s3");
	}
}
class Bihar extends UP
{
	static void s4() {
		System.out.println("s4");
	}
}
public class India extends Bihar
{
	void s5() {
		System.out.println("s5");
	}

	public static void main(String[] args)
	{
		UP u1=new Bihar();
		u1.s1();
		u1.s3();
		u1.s2();
		Bihar b1= (Bihar) u1;
		b1.s1();
		b1.s2();
		b1.s3();
		b1.s4();

	}

}  */
