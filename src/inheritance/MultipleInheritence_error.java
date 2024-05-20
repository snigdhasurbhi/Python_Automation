package inheritance;
class Father{
static	void Parent() {
		System.out.println("i am the parent class");
	}
}
class Mother {
	void Parent1() {
		System.out.println("i am the parent1 class");
	}
}




public class MultipleInheritence_error  implements Father and  Mother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Parent();
  Parent1();
	}

}
