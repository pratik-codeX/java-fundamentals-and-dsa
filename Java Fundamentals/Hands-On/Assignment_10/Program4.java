//4.Write a program which accept temperature in Fahrenheit and convert it into
//celsius. (1 celsius = (Fahrenheit -32) * (5/9))

import java.util.Scanner;

public class Program4
{
    public static float FhtoCs(float temp)
    {
        if(temp < 0)
        {
            temp = -temp;
        }

        return (temp - 32) * 5/9;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        float cnt = sobj.nextFloat();

        System.out.println(FhtoCs(cnt));
    }
}
