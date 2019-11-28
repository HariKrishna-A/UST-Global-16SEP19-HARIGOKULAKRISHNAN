import java.util.*;
class Greatest_No
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how mny elemnts..: ");
		int a = sc.nextInt();
		int[] arr =new int[a];
		System.out.println("entet a ellmts..:");
		for(int j=0; j<arr.length; j++)
		{
			arr[j] = sc.nextInt();
		}
		//int arr[] = {10,24,356,-678,77,22,568,0};
		int temp = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(temp <= arr[i])
			{
				temp = arr[i];
			}
		}
		System.out.println("Grest among numbr : "+temp);
 	}
}