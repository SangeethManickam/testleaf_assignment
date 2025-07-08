package week3.Day5;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "potss";
		String str2 = "stops";
		
		if (str1.length() == str2.length())
		{
			
			char s1[] = str1.toCharArray();
			char s2[] = str2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			if (Arrays.equals(s1, s2))
			{
				System.out.println("Given two srings is an Anagram");
			}
			else
			{
				System.out.println("Given two srings is not an Anagram");
			}
			
		}
		
		else
		{
			System.out.println("Given two srings is not an Anagram");
		}

	}

}
