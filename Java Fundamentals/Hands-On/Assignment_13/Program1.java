//Print all numbers from 1 to N

import java.util.Scanner;

public class Program1
{
    public static void print_numbers(int limit)
    {
        int Cnt = 0;
        while(Cnt <= limit)
        {
            System.out.println(Cnt++);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int number = sobj.nextInt();

        print_numbers(number);
    }
}
