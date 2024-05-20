package inheritance;
 class Senior{
	 static void Smethod() {
		 System.out.println(" i am the smethod");
	 }
	 
	 void S1method() {
		 System.out.println(" i am the S1method"); 
	 }

 Senior(){
	 System.out.println(" i am the Senior");
 }
 }
 

public class Inheritance_Constructor extends Senior {

	Inheritance_Constructor(){
		 System.out.println(" i am the  Inheritance_Constructor ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritance_Constructor C1= new Inheritance_Constructor();
		Smethod();
		C1.S1method();
		
		
		
	}

}
