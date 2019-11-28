import java.util.*;
class Pattern
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length value...: ");
		int len = sc.nextInt();

		for(int i=0; i<len; i++)
		{
			if( i == 0 || i == len-1)
			{
				for(int j=0; j<len; j++)
				{
					System.out.print("* ");
				}
				//System.out.println();
			}
			else
			{
			  for(int k=0; k<len; k++)
			  {
			  	if(k == 0 || k 	== len-1)
			  		System.out.print("* ");
			  	else
			  		System.out.print("  ");
			  }
			}
			System.out.println();
		}
	 }
}