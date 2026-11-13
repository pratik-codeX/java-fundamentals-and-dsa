//3.Print all odd numbers up to N

import java.util.Scanner;

public class Program3
{
     public static void print_odd_numbers(int limit)
    {
        int cnt = 1;

        while(cnt <= limit)
        {
            if(cnt % 2 != 0)
            {
                System.out.println(cnt);
            }
            cnt++;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int number = sobj.nextInt();

        print_odd_numbers(number);
    }
}