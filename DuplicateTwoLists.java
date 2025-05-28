package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateTwoLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(1, 33, 66, 77, 22));

        ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(33, 77, 1, 1, 2));

        listOne.retainAll(listTwo);

        System.out.println(listOne);
        
	}

}
