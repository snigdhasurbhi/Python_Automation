package automation1;

public class CharLiteral {

	public static void main(String[] args) {
		// single char literal within single quote
		char ch='A';
		char c='a';
		
		
		//integral literal with octal form
		char o= 555;
		
		
		//unicode representation
		
		char u ='\u0061';
		
		System.out.println(ch);
		System.out.println(c);
		System.out.println(o);
		System.out.println(u);
		System.out.println("\\\" is a symbol");
		System.out.println("\"is a  symbol");
		System.out.println("? is a symbol");
	}

}
