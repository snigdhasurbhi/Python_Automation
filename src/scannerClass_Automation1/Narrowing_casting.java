package scannerClass_Automation1;

public class Narrowing_casting {

	public static void main(String[] args) {
		// 
		
		double a= 56.80;   // right to left
		float b = (float) a;
		long  c= (long)b;
		int d = (int) c;
		short e =(short) d;
		byte f= (byte) e;
		System.out.println(" Print the value for a" + a);
		System.out.println(" Print the value for b" + b);
		System.out.println(" Print the value for c" + c);
		System.out.println(" Print the value for d" + d);
		System.out.println(" Print the value for e" + e);
		System.out.println(" Print the value for f" + f);

		

	}

}
