package inheritance;

 class Vehicle {
 static void car() {
	System.out.println("this car belong to me");
}
 
static void bike() {
	System.out.println("this bike belongs to me");
}
   void object() {  // nonstatic method 
	System.out.println("i have object ");
}
}

public class Multiple_inheritance extends Vehicle {

	static void cycle() {
		System.out.println("i have cycle");
	}
	public static void main(String[] args) {
		Multiple_inheritance M1= new Multiple_inheritance();
		bike();
		car();
		M1.object();  // nonstatic method called by an object creation.
		cycle();
		
		// 

	}

}
