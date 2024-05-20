package access_Specifier;

public class withinclass {

	public static void main(String[] args) {
		// 
		withinclass w1 = new withinclass();
		w1.car();
		w1.Student3();
		w1.Student4();
		w1.student5();
		
	//All access specifere is accessed in the within the class

	}
	private  void  car() {

		System.out.println(" private ");	
	}

	protected static  void Student3() {
		System.out.println(" protected ");
	}
	public void  Student4() {
		System.out.println(" public ");
		
	}
	static void  student5() {
		System.out.println(" car ");
	}
}



