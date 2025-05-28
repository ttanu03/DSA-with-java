package collection;

import java.util.LinkedHashSet;

public class LinkedlListHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedset= new LinkedHashSet<String>();
		//adding element to linked hashset
		linkedset.add("Tanu");
		linkedset.add("Rohit");
		linkedset.add("palak");
		linkedset.add("tiwari");
		
		//This will not add new element  as  name already  exist
		
		linkedset.add("Tanu");
		linkedset.add("palak");
		
		System.out.println("Size of linkedHashSet="+linkedset.size());
		System.out.println("original linkedlist set:"+linkedset);
		
		System.out.println("Remove rohit from the list :"+linkedset.remove("Rohit"));
		
		System.out.println("Trying to remove test which is  not present"+ linkedset.remove("pushpa"));
		
		System.out.println("checking if tanu is present or not="+linkedset.contains("tanu"));
		
		System.out.println("Updated LinkedHashset:"+linkedset);
	}
}

