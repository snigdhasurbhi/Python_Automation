//Wap for matching grade


package automation1;

public class IF_else_if_else {

	public static void main(String[] args) {
	int value= 50;   // only one condition will be true 
	if (value> 90) {
	System.out.println("the grade is A+");

	}
	else if (value < 25) {
		System.out.println("the grade is D");
		
	}
	else if(value>25 && (value<45)) {
		System.out.println("the grade is C ");
	}
	
	else if ( value > 45 &&  (value <66)) {
		System.out.println("the grade is B");
	}
	
	else if ( value > 66 &&  (value <80)) {
		System.out.println("the grade is A");
	}
}
}
