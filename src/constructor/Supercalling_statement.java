package constructor;

 class  parent_constructor{
public 	 parent_constructor(){
	System.out.println(" parent_construct ");	 
	 }
public static  void  Studen1() {

	System.out.println(" private ");	
}

}


public class Supercalling_statement  extends parent_constructor {

	public   void Student3() {
		System.out.println(" protected ");
	}
	public void  Student4() {
		System.out.println(" public ");
	}
public 	Supercalling_statement() {
	System.out.println("constructor ");
}


public 	Supercalling_statement(int i) {
	super();
	
	System.out.println("constructor 1 ");
}
	
	public static void main(String[] args) {
		// 
		
		Supercalling_statement p1 =  new Supercalling_statement(2);  // it parameter
		
p1.Student3();
p1.Student4();
Studen1();
	}

}
