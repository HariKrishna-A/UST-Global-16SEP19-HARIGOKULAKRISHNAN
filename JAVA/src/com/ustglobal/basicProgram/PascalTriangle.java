import java.util.*;
class demo1
{
	public static void test()
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a row...: ");
       int a = sc.nextInt();

       int temp = 0;
       int temp1 = 0;
      
       for(int i=0; i<8; i++)
       {
       	for(int j=0,k=7; j<8; j++,k--)
       	{
       		if(i%2==0&&j==5)
       		{
       			System.out.print(" * ");
       		}
       		else
       		{
       			System.out.print("   ");
       		}
       	}
       	System.out.println();
       }
	}
}
class PascalTriangle
{
	public static void main(String[] args) 
	{
		demo1.test();
	}
}