package inheritance;

class Maain{
	
 void Mmethod(){
	System.out.println(" hellow Mmethod"); 
 }
}
 class Pmaain extends Maain{
	 void Pmethod() {
		 System.out.println(" hellow Pmethod");  
	 }
 }

public class Multipleclass {

	public static void main(String[] args) {
		// 
		Pmaain P1=new Pmaain();
		Maain M1 = new Maain();
		P1.Mmethod();
		P1.Pmethod();
		M1.Mmethod();
	//	M1.Pmethod();
		

	}

}
