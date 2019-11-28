import java.util.*;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No. : ");
		int i = sc.nextInt();
		int count = 0;

		for (int a=1; a<=i ; a++) 
		{
		    if(i%a==0)
		  {
		    	count++;
		  }	
		}

		if(count == 2)
		{
			System.out.println("Its's a Prime");
		}
		else 
			System.out.println("Not a Prime");
	}
}