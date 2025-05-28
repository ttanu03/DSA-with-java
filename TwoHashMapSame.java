package collection;

import java.util.HashMap;

public class TwoHashMapSame {
	public static void main	(String[] args) {
		//create a hashmap 
		HashMap<Integer,String> one=  new HashMap<>();
		one.put(1,"Ttanu");
		one.put(2, "Palak");
		one.put(3, "maa");
		/// same  as map1
		HashMap<Integer,String>two= new HashMap<>();
		two.put(3,"maa");
		two.put(1,"Ttanu");
		two.put(2, "Palak");
		
		//different  map
		HashMap<Integer,String> three= new HashMap<>();
		three.put(1,"Ttanu");
		three.put(2, "Palak");
		three.put(3, "maa");
		three.put(4,"dad");
		
		System.out.println(one.equals(two));
		System.out.println(one.equals(three));
		
		
		
	}

}
