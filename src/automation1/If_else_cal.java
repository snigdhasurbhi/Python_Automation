// wap for 10% discount on above amount of 1000

package automation1;

public class If_else_cal {

	public static void main(String[] args) {
		int x= 5000;       /// only one condition will be true
		
		if(x>1000) {
			System.out.println(" you discount of " +(x*10/100) + "your value after discount is " + (x-(x*10/100)) );
		}

		else {
			System.out.println("no discount");
		}
		
	}

}
