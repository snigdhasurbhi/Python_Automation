package operator;

public class Unary_postfixnprefix {

	public static void main(String[] args) {
		int X= 50, Y= 60;
		System.out.println(X++);  // postfix  50 (51)
		 System.out.println(X--); // 51 (50)
		System.out.println(++X);  // prefix (51)
		System.out.println(--X);  // prefix (50)
		System.out.println(++X);   //51  
		System.out.println(++X);  // 52
		System.out.println(X++);  //52
		//
		
		System.out.println(X++ + ++X);  // 52 +54 = 
		System.out.println(++Y + Y++);  //61+ 61 =
		  System.out.println(X++ + X++); // 54 + 55 =   // need to ask 
		System.out.println(++Y + ++Y);  //63 + 64 =
	}

}
