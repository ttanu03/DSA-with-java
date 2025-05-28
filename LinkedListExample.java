package collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String>list1= new LinkedList<String>();
		System.out.println("Initial List is "+ list1);
		list1.add("Sanya");
		list1.add("palak");
		list1.add("tanu");
		list1.add("khushi");
		System.out.println("After adding"+ list1);
		
		//adding value at a specific index
		
		list1.add(1,"tanutiwari");
		System.out.println("After adding at  a specific index"+ list1);
		
		LinkedList<String> list2= new LinkedList<String>();
		list2.add("tanya");
		list2.add("chandra bhushan");
		list2.add("savita");
		list2.add("tanut");
		
		//adding second list element  to the first list
		list1.addAll(list2);
		System.out.println("After adding list one is "+ list1);
		
		LinkedList<String>list3= new LinkedList<String>();
		list3.add("sid");
		list3.add("ballia");
		list3.add("mumbai");
		
	System.out.println("list3");
	
	// adding third list element to the first list at specific position
	
	list1.addAll(1,list3);
	
	System.out.println("after adding al three list element into first list"+ list1);
	
	//adding an element at the first  position
	
	list1.addFirst("SavitaTiwari");
	
	System.out.println("After  adding the name in the start "+list1);
	
	//adding an element at the last position
	
	list1.addLast("ChandraBHushanTiwari");
	System.out.println("after addng the last name"+ list1);
	}
}