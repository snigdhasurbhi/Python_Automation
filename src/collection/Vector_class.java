package collection;

import java.util.Collections;
import java.util.Vector;

public class Vector_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v1= new Vector();
		v1.add(67);
		  v1.add(47);
		  v1.add(32); // sorting
		
		// Collections.sort(v1);
		 Collections.sort(v1);
		 System.out.println(v1);
		
		Vector a1 = new Vector();
		  a1.add(67);
		  a1.add(766.567);
		  a1.add("String");
		  a1.add('r');
		  a1.add('r');
		  a1.add(null);
		  a1.add(67);
		  a1.add(766.567);
		  a1.add(87);
		  a1.add(57);
	      a1.add("Subject");
		  a1.add('r');
		  a1.add('r');
		  a1.add(null);
		  a1.add(67);
		  a1.add(766.567);
		  a1.add("Subject");
		  a1.add('r'); //duplicate is allowed 
		  a1.add('r'); //duplicate is allowed 
		  a1.add(null);  //null is casesenestive, null is allowed
		  System.out.println(a1);
		  a1.get(2);
		  System.out.println(a1.get(2));  
		 
		  
		  
			}

		
		
	}


