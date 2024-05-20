package override;
abstract class india {
	abstract void function();//abstract method, overiding, abstract will always be  non static, 

	abstract void function2();//abstract metho

	abstract void function3();//abstract metho

	void add() {//concreate method
		System.out.println("hello i am add");
	}

	static void sub() {//concraete method
		System.out.println("i am sub method");
	}
}
public class Abstract_1 extends india {

	public static void main(String[] args) 
	{
		Abstract_1 a1= new Abstract_1();
		a1.function();
		a1.function2();
		a1.function3();
		a1.add();
		a1.sub();
		

	}

	@Override
	void function() {
		// TODO Auto-generated method stub
		System.out.println("i am fun method");
	}

	@Override
	void function2() {
		// TODO Auto-generated method stub
		System.out.println("i am function1 method");
	}

	@Override
	void function3() {
		// TODO Auto-generated method stub
		System.out.println("i am function2 method");
		
		
	}

}
