package collection;

import java.util.Collections;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 TreeSet t1 = new TreeSet();
 t1.add(11);
 t1.add(11);
 t1.add(41);
// t1 = (TreeSet).sort();
// Collections.sort(t1);
 
 System.out.println(t1);
 TreeSet S1 = new TreeSet();
 S1.add(11);  // it shows that its dont allow dynamic 
 S1.add(41);  // hetrogenouse data is not allowed
 S1.add(11); // order of insertion is not allowed 
 S1.add(41);
 S1.add(0); // sort is possible

/* t1.add(41.78);
 t1.add(0.41);  */
 t1.add(41);  // duplicate value is not allowed 
 // t1.add(null);  null value is not allowed 
 /*  t1.add(41);
 t1.add(0);
 t1.add(11.234);  // hetrogenouse data is not allowed
 t1.add("Snigdha"); */
 // t1.get(7);   random access is not allowed 
 t1.addAll(t1);
 S1.addAll(S1);  ///it was not working
 System.out.println(S1);
 
	}

}
