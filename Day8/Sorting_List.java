package week4.Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_List {

	public static void main(String[] args) {
		
		// Sort using Collections and Print it in reverse order
		
		String[] str = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> str1 = new ArrayList<String>();
		
		for(String i : str)
			str1.add(i);
		
		Collections.sort(str1);
		
		List<String> str2 = new ArrayList<String>();
		
		for(int i=str1.size()-1 ; i>=0 ; i--)
		{
			str2.add(str1.get(i));
		}
		
		System.out.println(str2);
		
	}

}
