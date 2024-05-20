package automation1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading M1= new MethodOverloading();
		M1.overload(0);
		M1.overload(-50, (byte)76);
	    M1.overload(false, "null", 0);
		overload(90,(byte) 1);
	overload(467.9, 'h');
	overload(76698.34, 6344.8, 56.8, 7680.56);
	overload((short)50);
	}
	static void overload(int a) 
	{
		System.out.println("hi i am throwing int value");
	}
static	void overload(int a, byte b) {
		System.out.println("hi i am throwing int and byte value");
	}
	
	void overload(short d, long e) {
		System.out.println("hi i am throwing short and long value");
	}
static	void overload(double f, char g) {
		System.out.println("hi i am throwing float and char value");
	}
	void overload(boolean h, String i, int j) {
		System.out.println("hi i am throwing String and int value");
	}
static	void overload(double a, double b, double c, double d) {
		System.out.println("hi i am throwing doubles  value");
	}
static	void overload(short d) {
	System.out.println("hi i am throwing double   ghggs  value");
}

}


