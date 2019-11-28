import java.util.*;
class Reverse_Int
{

    public static void p(int number)
    {
        int no = number;
        int no1 = no;
        int  temp1 = 0;
        int temp = 0; 
        
        while(no>0)
        {
             temp = no%10;
             no = no/10;
             temp1 = (temp1*10)+temp;
        }

        
        if(no1 == temp1)
        {
            System.out.println(temp1);
        }
        else{
            int add = no1 + temp1;
            p(add);

        }
    }



    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number..: ");
        int userNo = sc.nextInt();
        p(userNo);
 
    }
}