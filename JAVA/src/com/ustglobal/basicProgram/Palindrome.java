import java .util.*;
class demo
{
	public static void test(String a)
	{
		int len = a.length()-1;
		String str1 = "";
		for(int i=len; i>=0; i--)
		{
			str1 =str1 + a.charAt(i);
		}
		
		if(a.equals(str1))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}
}
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.nextLine();
        demo.test(str);
	}
}