//4.Find sum of first N natural numbers

import java.util.Scanner;

public class Program4
{
    public static int sum_natural_numbers(int limit)
    {
        int Sum = 0;
        int cnt = 1;

        while(cnt <= limit)
        {
            Sum = Sum + cnt;

            cnt++;
        }
        return Sum;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int number = sobj.nextInt();

        System.out.println(sum_natural_numbers(number));

    }
}