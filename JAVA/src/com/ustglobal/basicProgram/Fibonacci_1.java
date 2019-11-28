import java.util.*;
class Fibonacci_1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number..: ");
		int a = sc.nextInt();
        int temp = 0;
        int f = 0,s = 1;
        System.out.println(f);
        System.out.println(s);
		while(true)
		{
			temp = f+s;
			if(temp>=a)
			{
				break;
			}
			f = s;
			s = temp;
			System.out.println(temp);
		}
	}
}