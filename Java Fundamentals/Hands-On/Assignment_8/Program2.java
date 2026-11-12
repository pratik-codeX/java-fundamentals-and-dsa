//1.Accept single digit number from user and print it into word.

import java.util.Scanner;

public class Program2
{
    public static void Display(int num)
    {
        String arr[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        if(num < 0)
        {
            num = -num;
        }
        
        try
        {
            System.out.println(arr[num]);
        }
        catch(Exception e)
        {
            System.out.println("Invalid Number");
        }
        System.out.println("Enter Valid Number");
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int cnt = sobj.nextInt();

        Display(cnt);
    }
}
