package automation1;

public class Constructor {
	
	
	public Constructor() {
		System.out.println("hjello");
	}
	public Constructor(int i) 
	{
		System.out.println("hjello356335");
	}

	public static void main(String[] args) {
		Constructor c1 = new Constructor();
	//	c1.Constructor(int i);
		Constructor c2 = new Constructor(5);  // for parameterisied
	}

}
