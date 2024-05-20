package inheritance;
 class Parent{
	
	 static void is() {
	System.out.println("this is parent class");
	 }
	void the() {
	 System.out.println("i am the non static class");

	 
	 }
}

public class Simple_inheritance extends Parent{

	public static void main(String[] args) {
		//
		Simple_inheritance S1 = new Simple_inheritance();
		S1.the();
		is();
		
System.out.println("this is child class");
	}

}
