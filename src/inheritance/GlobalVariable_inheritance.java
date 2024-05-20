package inheritance;
class All{
	String name, address; int phonenumber, age ; double salary; 
void Info() {
	System.out.println(name);
	System.out.println(salary);
}
}
class Memebers extends All{
	void details() {
		System.out.println(phonenumber);
		System.out.println(address);
		System.out.println(age);
		System.out.println(salary);
	}
	}
class Employee extends Memebers {
	// int department;
	String department = "Electric";
	
	Employee(){
		System.out.println(department + "hello");	
	}
	}
class Manager extends Employee{
  //	int Role;
	String Role = "Principle";
	Manager(){
		System.out.println(Role + "mike");
	}
}
public class GlobalVariable_inheritance  extends Manager{

	public static void main(String[] args) {
		// 
		new Employee();
		new Manager();
		
		GlobalVariable_inheritance G1= new GlobalVariable_inheritance();
		G1.address = "Alpha house 1234" ;
		G1.age = 67;
		G1.name = "Beta";
		G1.phonenumber = 979897989;
		G1.salary = 423142.4554;
	//	G1.Role = 18;
	// G1.department = 26 ;
		G1.Role= "Director";
		G1.department = "Mechnical";
		G1.details();
		G1.Info();
		}

}
