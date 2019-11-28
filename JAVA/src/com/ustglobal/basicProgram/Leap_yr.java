import java.util.*;
class Leap_yr
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Yr..: ");
		int a = sc.nextInt();
		boolean leap = false;

		if(a%4==0)
		{
			if(a%100==0)
			{
				if(a%400==0)
				{
					leap = true;
				}
				else 
				{
					leap = false;
				}
			}
			else 
			{
				leap = true;
			}
		}
		if(leap)
		{
			System.out.println("Leap_Yr");
		}
		else
		{
			System.out.println("Not Leap_Yr");
		}
	}
}