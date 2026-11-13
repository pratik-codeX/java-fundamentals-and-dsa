//5.Find sum of first N even numbers

import java.util.Scanner;

public class Program5
{
    public static int sum_even_numbers(int iNo)
    {
        int Cnt = 0;
        int Sum = 0;
        while(Cnt <= iNo)
        {
            if(Cnt % 2 == 0)
            {
                Sum = Sum + Cnt;
            }
            Cnt++;
        }
        return Sum;

    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");    
        int num = sobj.nextInt();
        
       System.out.println(sum_even_numbers(num) );
    }
}
