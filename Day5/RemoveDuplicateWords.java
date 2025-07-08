package week3.Day5;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "We learn Java basics as part of java sessions in java week1";
		String[] split = str.split(" ");
		int count = 0;
		
		for(int i=0 ; i<split.length ; i++ )
		{
			for (int j=i+1 ; j<split.length ; j++)
			{
				if(split[i].equalsIgnoreCase(split[j]))
				{
					split[j]=" ";
					count++;
					
					//System.out.println(i+""+j+ " : "+split[i]);
				}				
			}
			
		}
		//System.out.println(count);
		
		if(count>0)
		{
		for (int i=0 ; i<split.length ; i++)
		{
			System.out.print(split[i] + " ");
		}
		}

	}

}
