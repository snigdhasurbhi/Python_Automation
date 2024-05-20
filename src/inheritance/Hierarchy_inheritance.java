package inheritance;
class Worker{
	static double salary= 500000.709;  static int age;  static int YOE; static String name;
	static void salary() 
	{
		System.out.println("employee salary will depends on the year of expereience ");
		System.out.println("age default value is " +age);	
		System.out.println("YOE default value is " +YOE);
		System.out.println("Name default value is " +name);
	}
	void life() {
		System.out.println("employee working span should be 8 hours");
	}
}
class FiveYear extends Worker {
	static void experience() {
		System.out.println("employee has 5 years of expereience ");	
		System.out.println(age + "age is " + "25");
	System.out.println(YOE + "YOE is "+ "5");
	System.out.println(name + "name is "+  "Snigdha");
	
}
	void time() {
		System.out.println("employee working span is more than  8 hours");
	}
	}
	class TwoYear extends Worker {
		static void experience() {
			System.out.println("employee has 2 years of expereience ");	
			System.out.println(age + "age default value is " + "22");
		System.out.println(YOE + "YOE default value is "+  "2");
		System.out.println(name + "name default value is "+ "XYZ");
		}
		void year() {
			System.out.println(age + "2");
		}
	}

		class TenYear extends Worker {
			static void experiences() {
				System.out.println("employee has 10 years of expereience ");	
				System.out.println(age + "35");
			System.out.println(YOE + "10");
			System.out.println(name + "Snigdha");
			
		}
			}

public class Hierarchy_inheritance extends Worker{

	public static void main(String[] args) {
		// 
		salary();
		Hierarchy_inheritance h1= new Hierarchy_inheritance();
		h1.age= 25;
        h1.life();
        FiveYear F1= new FiveYear();
       F1.experience();
        F1.time();
        TwoYear T1 = new TwoYear();
        T1.year();
        T1.experience();
        TenYear t2 = new TenYear();
        t2.experiences();
	
	
	}

}
