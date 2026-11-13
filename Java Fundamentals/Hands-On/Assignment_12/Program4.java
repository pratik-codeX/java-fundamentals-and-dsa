//4..Write a program which accept range from user and return addition of all even
//numbers in between that range. (Range should contains positive numbers only)

import java.util.Scanner;

public class Program4
{
    public static int sum_of_even_factors(int iNo)
    {
        int Fact = 1;
        int Sum = 0;

        while(Fact <= iNo/2)
        {
            if(iNo % Fact == 0 && Fact % 2 == 0)
            {
               Sum = Fact + Sum; 
            }
            Fact++;
        }
        return Sum;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int number = sobj.nextInt();

        System.out.println(sum_of_even_factors(number));
    }
}