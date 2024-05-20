package collection;

import java.util.*;

public class Linked_hashset {

	public static void main(String[] args) {
		// 
		LinkedHashSet H1 = new LinkedHashSet();
		H1.add(55);
		H1.add(65);
	H1.add(45);
		H1.add(55);
		System.out.println(H1);
	//	Collections.sort(l1);  // sorting is not working
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add("class");
		l1.add(55);
	l1.add(0.12);
		l1.add(0.12);// duplicate is not allowed 
		l1.add(0.11);   // hetrogenouse data is allowed 
		l1.add(null);  // null is allowed 
		l1.add(0.11);  // order of insertion is allowed 
		l1.add(null);  // dynamic is allowed 
		
	// 	l1.get(6); random access is not possible
		System.out.println(l1);
	String[] args2 = new String[args.length + 1];
	System.arraycopy(args, 0, args2, 0, args.length);
//	args2[args.length] = l1;
		

	}

}
