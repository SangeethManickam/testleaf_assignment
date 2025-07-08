package week3.Day5;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Sangeeth";
		char c1[] = str1.toCharArray();
		
		// 1st Way
		for (int i = 0 ; i < c1.length ; i++)
		{
			if(i%2 != 0)
			{
				c1[i] = (char) (c1[i] - 32) ;
			}
		}
				
		String str2 = new String(c1);
		System.out.println("1st Way : "+str2);
		
		//2nd way
		char c2[] = str1.toCharArray();
		
		for (int i = 0 ; i < c2.length ; i++)
		{
			if(i%2 != 0)
			{
				c2[i] = Character.toUpperCase(c2[i]);
			}
		}
		String str3 = new String(c2);
		System.out.println("2nd Way : "+str3);

	}

}
