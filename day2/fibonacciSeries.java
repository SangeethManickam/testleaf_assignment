package week1.day2;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8;
		int a = 0;
		int b = 1;
		
		System.out.print(a+" "+b+" ");
		for(int i=2; i<range ; i++)
		{
			int num = a+b;
			a=b;
			b=num;
			System.out.print(num+" ");			
		}
	}

}
