package exceptions;

public class Trycatch {

	public static void main(String[] args) {
		// 
		String [] name= {"Ram", "Snigdha", "Radha", "Mkt"};
	// 	System.out.println("name of the" + name[7] ); because of 7 we got an error
		try {
			System.out.println("name of the" + name[7] );
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("handling");
		}

	}

}
