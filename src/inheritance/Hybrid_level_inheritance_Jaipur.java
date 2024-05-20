package inheritance;
class pun{
	static void w1() {
		System.out.println("hi i am inside pune class ");
	}
	void w2() {
		System.out.println(" hi i am inside w2 method of class Pune");
	}

}
class Kolkat extends pun{
	static void w3() {
		System.out.println("hi i am inside kolkata class ");
	}
	void w4() {
		System.out.println(" hi i am inside w4 method of class kolkata");
	}
}
class chenna extends Kolkat{
	static void w5() {
		System.out.println("hi i am inside Chennai class ");
	}
	void w6() {
		System.out.println(" hi i am inside w6 method of class Chennai");
	}
}

public class Hybrid_level_inheritance_Jaipur extends pun {

	static void w7() {
		System.out.println("hi i am inside Jaipur class ");
	}
	void w8() {
		System.out.println(" hi i am inside w6 method of class Jaipur");
	}
	public static void main(String[] args) {
		// 
	w7();
	w1();
	Hybrid_level_inheritance_Jaipur H1 = new Hybrid_level_inheritance_Jaipur();
	H1.w8();
	H1.w2();
	Kolkat K1= new Kolkat();
	K1.w4();
	K1.w2();
	K1.w3();
	K1.w1();
	chenna C1 = new chenna();
	C1.w5();
	C1.w1();
	C1.w2();
	C1.w6();
	C1.w3();
	C1.w4();
	}

}
