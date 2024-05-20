package methodOverriding;

  class Parent{
	
	final  static void is() {
	System.out.println("this is parent class");
	 }
	void the() {
	 System.out.println("i am the non static class");

	 
	 }


// the best practice that create final method for super class so that method cannot be overridden.



public class Final_keyword extends Parent {
	

	 static void is() {
	System.out.println("this is parent class");
	 }
	 

 final double pi = 3.14;  final int min= 60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //  pi= 6798; 
		// final, static and non-static all are modifier
	}

}
  }
