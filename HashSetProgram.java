package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {
	
	public static void main(String[] args) {
		//creating a hashset
		
		Set<String> Week = new HashSet<>();
		//adding new element to the hashset 
		Week.add("Monday");
		Week.add("Tuesday");
		Week.add("Wednesday");
		Week.add("Thursday");
		Week.add("Friday");
		Week.add("Saturday");
		Week.add("Sunday");
		//adding duplicate element will be ignored
		
		Week.add("Monday");
		Week.add("tuesday");
		System.out.println( Week);
		
		
	
		
	}

}
