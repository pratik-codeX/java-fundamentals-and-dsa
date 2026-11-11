//4. Write a program which accept three numbers and print its multiplication.

import java.util.Scanner;

public class Program4
{
    public static int Multiply(int A,int B, int C)
    {
        return A*B*C;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int No = sobj.nextInt();

       System.out.println(Multiply(5,1,5));
    }
}
