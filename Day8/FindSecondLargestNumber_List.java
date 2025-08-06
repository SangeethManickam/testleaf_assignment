package week4.Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3, 2, 11, 4, 6, 7};
		
		List<Integer> a1 = new ArrayList<Integer>();
		for(int i:a)
			a1.add(i);
		
		System.out.println("Before Sort : "+a1);
		
		Collections.sort(a1);
		
		System.out.println("After Sort : "+a1);
		
		int size = a1.size();
		
		System.out.println("Second Largert Number : "+ a1.get(size-2));
	

	}

}
