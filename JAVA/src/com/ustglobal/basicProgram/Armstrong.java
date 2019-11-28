import java.util.*;
class Armstrong
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num..for str : ");
		int st_v = sc.nextInt();
		System.out.println("Enter a num..for End : ");
		int en_v= sc.nextInt();
		for (int i=st_v; i<=en_v; i++)
		{
	    
			int cpy1 = i;
			int cpy2 = i;
			int count = 0;
			int a,b,temp =1,sum = 0;

        while(cpy1>0)
        {
         a = cpy1%10;
         cpy1 = cpy1/10;
         count++; 
        }
        
        while(cpy2>0)
        {
           b = cpy2%10;
           cpy2 = cpy2/10;
           for(int j = 0; j<count; j++)
           {
             temp = temp * b;
           }
            sum = sum + temp;
            temp = 1;
        }
       // System.out.println(sum);
        if(i == sum)
        {
        	System.out.println(i + " = Armstrong..");

        }
        // else 
        // {
        // 	System.out.println(i +" = Not Armstrong...");
        // }
	 }
	}
}