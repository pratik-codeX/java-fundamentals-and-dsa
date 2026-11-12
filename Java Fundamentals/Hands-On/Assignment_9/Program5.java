//5.Write a program which returns difference between Even factorial and odd factorial
//of given number.

import java.util.Scanner;

public class Program5
{
    public static int FactorialDiff(int num)
    {
        if(num < 0)
        {
            num = -num;
        }
        
        int EvenFact = 1,OddFact = 1;

        for(int i = 1;i <= num;i++)
        {
            if(i % 2 == 0)
            {
                EvenFact = EvenFact * i;
            }
            else
            {
                OddFact = OddFact * i;
            }
        }

        System.out.println(EvenFact);
        System.out.println(OddFact);

        return EvenFact - OddFact;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int No = sobj.nextInt();

        System.out.println(FactorialDiff(No));
    }
}
