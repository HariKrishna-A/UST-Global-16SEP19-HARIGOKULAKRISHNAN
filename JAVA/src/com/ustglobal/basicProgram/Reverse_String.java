import java .util.*;
class demo
{
	public static void test(String a)
	{
		int len = a.length()-1;
		for(int i=len; i>=0; i--)
		{
			System.out.print(a.charAt(i));
		}
	}
}
class Reverse_String
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.nextLine();
        demo.test(str);
	}
}