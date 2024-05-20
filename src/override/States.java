package override;
abstract class Jammu{
	abstract void function();
	abstract void function2();
	abstract void function3();
}

public class States extends Jammu {

	public static void main(String[] args) {
		// 
 States s1= new  States();
 s1.function();
s1.function2();
s1.function3();
}

	@Override
	void function() {
		// 
		System.out.println(" we are getting funtion");
		
	}

	@Override
	void function2() {
		// 
		System.out.println("we are getting funtion2 ");
		
	}

	@Override
	void function3() {
		// 
		System.out.println(" we are getting funtion 3");
		
	}

}
