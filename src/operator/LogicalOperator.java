package operator;

public class LogicalOperator {

	public static void main(String[] args) {
		// And opreator andlogical &&  BItwise &
int a=20 , b=15, c=25;
System.out.println(a<b && a<c);// a is less than b and a is less than c F and T = F
System.out.println(a<b & a<c);	// 	a is less than b and a is less than c F and T = F
System.out.println(a); // a value 20
System.out.println(a<b && a++<c); // 
System.out.println(a); // a is 20 beause in above only one condition is checked and that is f so 2nd condition is not checked 
System.out.println(a<b & a++<c);
System.out.println(a); // a is 21 because 2nd condition is also checked
	}

}
