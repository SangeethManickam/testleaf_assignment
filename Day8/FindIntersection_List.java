package week4.Day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =  {3, 2, 11, 4, 6, 7} ;
		int b[] = {1, 2, 8, 4, 9, 7} ;
		
		List<Integer> a1 = new ArrayList<Integer>() ;
		for(int i : a)  // int i is copied value from a array - then its iterated
			a1.add(i);
		
		//Here first loop : i=3 then i=2 and so on... and a is to iterate till end of array
		
		//System.out.println(a1);
		
		List<Integer> b1 = new ArrayList<Integer>();
		for (int i=0; i<b.length ; i++)
		{
			b1.add(b[i]);
		}		
		//System.out.println(b1);
		
		for (int i=0 ; i <a1.size() ; i++)
		{
			for (int j=0; j<b1.size() ; j++)
			{
				if(a1.get(i)==b1.get(j))
				{
					System.out.println(a1.get(i));
				}
			}
		}

	}

}
