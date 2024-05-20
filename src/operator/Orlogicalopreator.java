package operator;

public class Orlogicalopreator {

	public static void main(String[] args) {
		// Or logical operator || and Bitwise |
		int a=20 , b=15, c=25;
		System.out.println(a<b || a<c);// a is less than b and a is less than c F and T = T
		System.out.println(a<b | a<c);	// 	a is less than b and a is less than c F and T = T
		System.out.println(a); // a value 20
		System.out.println(a<b || a++<c); // F and T = T
		System.out.println(a); // a is 21 beause in above both  condition is checked and that is T so 2nd condition is checked 
		System.out.println(a<b | a++<c);
		System.out.println(a); // a is 22 because 2nd condition is also checked
	}

}
