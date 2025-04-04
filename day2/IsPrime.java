package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 18;
		int j=0;
		
		for(int i=2; i<a ; i++)
		{
			if(a%i == 0)
			{
				j++;
			}			
		}
		if(j==0)
		{
			System.out.println("Given number is Prime");
		}
		else
		{
			System.out.println("Given number is not a Prime");
		}

	}

}
