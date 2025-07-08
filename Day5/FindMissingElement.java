package week3.Day5;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {41,44,43,42,48,46,47};
		
		Arrays.sort(a);	
		
		for (int i = a[0], j =0  ; j < a.length ; i++, j++ )
		{
			if (i == a[j])
			{
				continue;
			}
				//continue;
				
			else
			{
				System.out.println("Missing Element : " + (a[j]-1));
				break;
			}
			
		}

	}

}
