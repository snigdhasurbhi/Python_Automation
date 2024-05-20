package array;

public class Inside_SIB {
	
	static {
		int ht[];
		ht = new int[8];
		 ht [0]= 180;
		 ht [1]= 185;
		 ht [2]= 181;
		 ht [3]= 179;
		 ht [4]= 169;
		 ht [5]= 170;
		 ht [6]= 190;
		 ht [7]= 184;
		
System.out.println(ht [6]);
for (int i = 0; i <=7 ; i++) {
	System.out.println(ht[i]);
}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] height= {170,160,163,175};  // syntax of array 
		 // int height[] = {1,2,3,4,5}; //syntax of array
		String [] name= {"Ram", "Snigdha", "Radha", "Mkt"};
		double [] weight = {85.63, 43.01, 68.07, 50.00}; 
		float [] y = {878.03f,78.1f,65.09f, 75.01f};
		
		System.out.println("name of the" + name[0] );
		System.out.println("weight of the" + weight[1] );
		System.out.println("height of the" + height[2] );
		System.out.println("y value is " + y[2] );
		
		
		for (int i =0; i<=3; i++) // i is the index value 
		{
			
			
			System.out.println(name[i]);
			System.out.println(weight[i]);
			System.out.println(height[i]);
			System.out.println(y[i]);
		}
	
	}

}
