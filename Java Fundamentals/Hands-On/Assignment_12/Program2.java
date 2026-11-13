//2.Count total factors of a number

import java.util.Scanner;

public class Program2
{
    public static int count_factors(int iNo)
    {
        int Fact = 1;
        int cnt = 0;

        while(Fact <= iNo/2)
        {
            if(iNo % Fact == 0)
            {
                cnt++;
            }
            Fact++;
        }
        return cnt;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");        
        int number = sobj.nextInt();

        int iRet = count_factors(number);

        System.out.println("Factors Count is :"+iRet);
    }
}