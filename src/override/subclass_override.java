package override;

class student1{
	void add() {//concreate method
		System.out.println("hello i am add parent class");  //
	}
}



public class subclass_override extends student1  {
	
	void add() {//concreate method
		System.out.println("hello i am add");  //
	
	
	super.add();  // sper keyword used for calling parent method.
	
	}


	public static void main(String[] args) {
		// 
		subclass_override s1 = new subclass_override();
		
		s1.add();

		
		
	}

}
