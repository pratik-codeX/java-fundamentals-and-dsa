//3.Sum of all factors of a number

import java.util.Scanner;

public class Program3
{
    public static int sum_of_factors(int iNo)
    {
        int Fact = 1;
        int Sum = 0;

        while(Fact <= iNo/2)
        {
            if(iNo % Fact == 0)
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

        System.out.println("Sum of Factors : " +sum_of_factors(number));
    }
}