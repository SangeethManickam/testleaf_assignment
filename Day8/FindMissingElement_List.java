package week4.Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> a1 = new ArrayList<Integer>();
		
		for (int i : a)
			a1.add(i);
		
		Collections.sort(a1);
		
		for(int i=0, j=1 ; j < a1.size() ; i++, j++)
		{
			
			if ((a1.get(j) - a1.get(i)) > 1 )
			{
				
				for(int k=(a1.get(i)+1); k<(a1.get(j)); k++)
				{
					System.out.println(k);
				}
			}
				
		}
		
		System.out.println(a1);

	}

}
