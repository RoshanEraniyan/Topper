import java.util.*;

class Topper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int registration_no=sc.nextInt();
        int oddsum=0,evensum=0;
        int digit=0;
        while(registration_no!=0)
        {
            digit=registration_no%10;
            if(digit%2==0)
            {
                evensum+=digit;
            }
            else
            {
                oddsum+=digit;
            }
            registration_no/=10;
        }
        if(oddsum==evensum)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
