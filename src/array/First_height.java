package array;

public class First_height {

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
