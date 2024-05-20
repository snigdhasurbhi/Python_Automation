package scannerClass_Automation1;

class Bhopal{
	 void  funtion1() {

			System.out.println("Bhopal is famous for the City of Lakes ");	
		}
	 void funtion2() {

			System.out.println(" Bhopal is famous for heritage site  ");	
}
}

class Nagpur extends Bhopal{
	 void  funtion3() {

			System.out.println("Nagpur is famous for Orange City ");	
		}
	 void funtion4() {

			System.out.println(" Nagpur is famous for Asia’s second biggest medical college. ");	
}
}

 class Jammu extends Nagpur{
	 void  funtion5() {

			System.out.println("Jammu is famous for its temples");	
		}
	 void funtion6() {

			System.out.println(" Jammu is famous for Vaishno Devi Mandir. ");	
}	
	 }

 class Chennai extends Jammu{
	 void  funtion5() {

			System.out.println("Chennai is famous for IIT");	
		}
	 void funtion6() {

			System.out.println(" Chennai is famous for  IT and industrial hub ");	
}	
	 }

public class States_UPCasting_Downcasting {
	 void  funtion7() {

			System.out.println("funtion7  ");	
		}
	 void funtion8() {

			System.out.println(" funtion8 ");	

		//	super.funtion8();
		//	super.funtion7();
	 }


	public static void main(String[] args) {
		// 

		Bhopal b1= new Nagpur();  // upcating nagpur to bhoapal
		b1.funtion1();
		b1.funtion2();
		
		Bhopal b2 = new Chennai();  // upcasting chennai to bhopal
		b2.funtion1();
         b2.funtion2();
		
		Chennai  c1	= (Chennai) b2;  // downcasting bhopal to chennai
		c1.funtion1();
		c1.funtion2();
		c1.funtion3();
		c1.funtion4();
		c1.funtion5();
		c1.funtion6();
		
	}

}
