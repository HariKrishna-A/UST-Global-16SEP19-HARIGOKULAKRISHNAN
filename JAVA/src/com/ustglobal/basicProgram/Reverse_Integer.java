import java.util.*;
class Reverse_Integer
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer ");
		int in = sc.nextInt();
		int temp = 0;

		while(in>0)
		{
			temp = in%10;
			in = in/10;
			System.out.print(temp);
		}
	}
}