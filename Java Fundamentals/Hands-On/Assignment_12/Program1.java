//Print all factors of a number.

import java.util.Scanner;

public class Program1
{
    public static void print_factors(int iNo)
    {
        int Fact = 1;

        while(Fact <= iNo/2)
        {
            if(iNo % Fact == 0)
            {
                System.out.println(Fact);
            }
            Fact++;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int number = sobj.nextInt();

            print_factors(number);
    }
}
