package collection;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_class {

	public static void main(String[] args) {
		// 

	LinkedList C1 = new LinkedList();
	C1.add(56);
	C1.add(56);	// duplicate value 
	C1.add(1);
	C1.add(1000);
	C1.add(100);
	C1.add(76);
	System.out.println(C1);
	Collections.sort(C1);  // sorting is not possible for linked list
		
		
	LinkedList L1 = new LinkedList();
	L1.add(null);
	L1.add("arg");
	L1.add('n');
	L1.add(57);
	L1.add(4590.98);
	
	 System.out.println(L1);
	  L1.get(2);
	  System.out.println(L1.get(2));
	  L1.add(4, 'c'); // we can add the value with idex and the value
	  System.out.println(L1);
	  L1.addAll(L1);  // the whole value is added 
	  System.out.println(L1);
	  L1.addAll(C1); // the whole value add again
	  System.out.println(L1);
	  L1.addAll(3, C1);
	  System.out.println(L1);
	//  L1.clear();
       System.out.println(L1);
       LinkedList B1 = new LinkedList();
       B1=(LinkedList) L1.clone(); // we want secure the B1 value
       System.out.println(L1);
       System.out.println(B1);
       System.out.println(L1.contains(57));
       System.out.println(B1);
	
	
	
	}
	
	

}
