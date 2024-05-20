package collection;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		// 
		PriorityQueue  P1 = new PriorityQueue();
	//	P1.notify();
		P1.add(34);
		P1.add(67);
		P1.add(0);
		P1.add(21);  // they dont follow order of insertion
		P1.add(0);    // duplicate value is added
		P1.add(0);
		P1.add(21);  // 
		P1.add(0);    // dynamic is allowed
		P1.add(0);
		P1.add(21);  // they dont follow order of insertion
		P1.add(0); 
	 //	Collections.sort((PriorityQueue) P1); // sorting is not allowed
	//	P1.add(0.6765);  hetrogenouse data is not allowed 
	//	  P1.add("hello");
		//  P1.add(null);     // null value is not allowed 
		  /*	P1.toString();
		P1.notifyAll();
		P1.hashCode();   
		PriorityQueue  S1 = new PriorityQueue();
		S1.add(null);   */
	//	P1.get(5);  
		
		System.out.println("hello");
		System.out.println(P1);
	// 	P1.get(2) random access is not possible 
		System.out.println(P1.getClass());
		P1.size();
		System.out.println(P1);
	//	P1.addAll(P1);
		System.out.println(P1);
		
		
		
		
		
		

	}

}
