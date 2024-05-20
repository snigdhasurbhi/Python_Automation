package interface_1;
interface  Parent1{
	void function1 ();
	void function4();
}
interface Parent2{
	void function2();
	void function3();
}

public class Interface_implements implements Parent1, Parent2  {
// achieved by multiple inheritance by implements
	public static void main(String[] args) {
		// 
		Interface_implements i = new Interface_implements();
		i.function1();
        i.function2();
		
	}

	@Override
	public void function2() {
		// 
		System.out.println("print function 2");
	}

	@Override
	public void function1() {
		// 
		System.out.println("print function 1");
		
	}

	@Override
	public void function3() {
		// 
		System.out.println("print function 3");
	}

	@Override
	public void function4() {
		// 
		System.out.println("print function 4");
	}

}
