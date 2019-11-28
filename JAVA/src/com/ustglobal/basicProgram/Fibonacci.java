import java.util.*;
class Fibonacci
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Str_value..: ");
		int str_v = sc.nextInt();
		System.out.println("Enter a End-Value..: ");
		int end_v = sc.nextInt();
         if(str_v == 0 )
			 {
			 	System.out.println(str_v);
                str_v = 1;
			 }
		int temp = str_v ;
		int g = 0;
		int r = 0;

		System.out.println(str_v);
		for(int i=str_v; i<=end_v; i++)
		{

			 r = g + temp;
			 System.out.println(r);
			 g = temp;
			 temp = r;
		}
	}
}