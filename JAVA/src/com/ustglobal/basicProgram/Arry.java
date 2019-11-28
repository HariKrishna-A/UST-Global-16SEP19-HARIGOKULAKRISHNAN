class Arry
{
	public static void main(String[] args) 
	{
		int [] a= {1,2,1,3,2,5,4,2,1,3};
		//int [] 
		int a1 = 0;
		int count = 1;
		for (int i=0; i<a.length; i++)
		{
          for(int j=i+1; j<a.length; j++)
          {
             if(a[i]==a[j])
             {  a[j]= a1;
             	count++;
             	//System.out.println(count);
             }
          }
          if(a[i] != 0)
          {
          System.out.println(a[i] +" "+count);
          }
          count = 1;
		}
	}
}