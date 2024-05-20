package override;
abstract class Himachal{
	abstract void function();
	abstract void function2();
	abstract void function3();
}

abstract class kashmir extends Himachal {
	abstract void function4();
	abstract void function5();
	abstract void function6();
}

public class World1 extends kashmir  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		World1 w1 = new World1();
		w1.function();
		w1.function2();
		w1.function3();
		w1.function4();
		w1.function5();
		w1.function6();
	}

	@Override
	void function() {
		
		System.out.println(" we are getting funtion");
	}

	@Override
	void function2() {
		System.out.println(" we are getting funtion2");
		
	}

	@Override
	void function3() {
		// TODO Auto-generated method stub
		System.out.println(" we are getting funtion3 ");
	}

	@Override
	void function4() {
		
		System.out.println(" we are getting funtion4 ");
	}

	@Override
	void function5() {
		System.out.println(" we are getting funtion5");
		
	}

	@Override
	void function6() {
		System.out.println(" we are getting funtion6 ");
		
	}

}
