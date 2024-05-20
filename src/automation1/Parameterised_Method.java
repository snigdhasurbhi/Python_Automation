package automation1;

public class Parameterised_Method {
 
	static void  add ( int a) {
	 
 
 System.out.println("value of a ");
 
 }
 static void  sub ( char a) {
	 
	 
 System.out.println("value of char ");
 
 }
 static void  mul ( String a) {
	 
	 
 System.out.println("value of string ");
 
 }
 static void  div ( byte a) {
	 
	 
 System.out.println("value of byte");
 
 }
	
	public static void main(String[] args) {
	
    add(7);
    sub('A');
    mul("Right");
    div((byte)9);
	

	}

}
