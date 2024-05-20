package methodOverriding;

class Students {
	void homework() {
		System.out.println("homework");
	}
}
public class Snigdha_Override extends Students {
	
	// we are getting subclass implementation.
	void homework() {
		System.out.println("please do your work");
		super.homework();   // by using super keyword we can get the super class implementation 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snigdha_Override S1= new Snigdha_Override();
		S1.homework();
	}

}
