package collection;

import java.util.Collections;
import java.util.HashSet;

public class Hash_set {

	public static void main(String[] args) {
		// 
		HashSet h1 = new HashSet();
		h1.add(56);
		h1.add(56);  //duplicate is nopt allowed 
		h1.add(76);
		h1.add(26);  // order of insertion is not allowed
		h1.add(56.01);  // hetrogenouse data is allowed 
		h1.add(null); // null is allowed
	//	h1.get(6); random access is not allowed
		HashSet f1 = new HashSet();
	//	f1 = (HashSet) Collections.sort(h1);  // sorting is not working
		
		
		System.out.println(h1);

	}

}
