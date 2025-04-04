package week1.day2;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		
		int a1 = 0;
		int a2 = num;
		while (num>0)
		{
			a1 = a1 * 10 + num % 10;
			num = num/10;
		}
		
		if(a2==a1)
		{
			System.out.println("is Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
