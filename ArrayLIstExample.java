package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLIstExample {

	public static void main(String[] args) {
		List<String> college = new ArrayList<>();
		//adding new elements to the arraylist}
		
		college.add("knit");
		college.add("fgiet");
		college.add("bbd");
		college.add("iit");
		System.out.println(college);
		//traversing list through iterator
		
	    Iterator<String> itr= college.iterator();
	    while (itr.hasNext()) {
	    	System.out.println(itr.next());
	    	
	    }
	    
	    ///adding an elememt in a particular inddex in  array list
	    
	    college.add(2,"iitdelhi");
	    System.out.println(college);
	

}
}
