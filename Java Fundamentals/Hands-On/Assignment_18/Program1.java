//Write a program to check whether a number is prime or not.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Logic
{
    void checkPrime(int num)
    {
        boolean flag = true;

        for(int i = 2;i < num/2; i++)
        {
            if(num % i == 0)
            {
                flag = false;
                break;
            }
        }

        if(flag == false)
        {
            System.out.println("its not prime");
        }
        else
        {
            System.out.println("Its prime");
        }
        //System.out.println(flag ? "Number is not Prime" : "Number is Prime");
    }
}

public class Program1
{
    
    public static void main(String[] args) 
    {
        BufferedReader bojj = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        System.out.println("Enter Number : ");
        try
        {
            String strNum = bojj.readLine(); 
            num = Integer.parseInt(strNum);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        Logic lobj = new Logic();

        lobj.checkPrime(num);
    }
}
