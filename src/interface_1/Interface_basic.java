package interface_1;
interface Student1{
	abstract void function();
	abstract void function2();
	abstract void function3();
 void add();
}

public class Interface_basic implements Student1 {

	public static void main(String[] args) {
		// 
		Interface_basic I1 = new Interface_basic();
		I1.add();
		I1.function();
		I1.function();
		I1.function2();
		I1.function3();
	}

	@Override
	public void function() {
		// 
		System.out.println("i am fun1 method");
	}

	@Override
	public void function2() {
		// 
		System.out.println("i am fun2 method");
	}

	@Override
	public void function3() {
		//
		System.out.println("i am fun3 method");
	}

	@Override
	public void add() {
		// 
		System.out.println("i am fun4 method");
	}

}
