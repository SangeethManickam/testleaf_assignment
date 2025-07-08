package week3.Day5;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am a software tester";
		
		String[] split = str.split(" ");
		
		for (int i = 0 ; i < split.length ; i++)
		{
			if(i%2!=0)
			{
				// String in Java are immutable, meaning that once created, their contents cannot be changed.
				//StringBuilder, on the other hand, is mutable, allowing you to append, insert, or delete characters without creating a new object.
				StringBuilder str1 = new StringBuilder(split[i]);
				split[i] = str1.reverse().toString();
			}
		}
		
		for(int i=0 ; i<split.length ; i++)
		{
			System.out.print(split[i]+" ");
		}

	}

}
