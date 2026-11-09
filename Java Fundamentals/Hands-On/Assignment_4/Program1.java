//1.Write a program which accept number from user and display its factors in
//dddecreasing order
import java.util.Scanner;

public class Program1
{
    public static int FactMult(int Num)
    {
        int iMult = 1;
        for(int i = 1 ; i < Num;i++)
        {
            if(Num % i == 0)
            {
                iMult = iMult * i;
            }
        }

        return iMult;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sobj.nextInt();

        System.out.println("multiplication of Fact is : "+FactMult(num));
    }
}
