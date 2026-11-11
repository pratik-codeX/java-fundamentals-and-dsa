//5. Accept number from user and check whether number is even or odd.
import java.util.Scanner;

public class Program5
{
    public static int FactDiff(int No)
    {
        int FactSum = 0,NonFactSum = 0;
        for(int i = 1; i < No; i++)
        {
            if(No % i == 0)
            {
                FactSum += i;
            }
            else
            {
                NonFactSum += i;
            }
        }

        return (FactSum - NonFactSum);
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        int No = sobj.nextInt();

        System.out.println("Differenct is : "+FactDiff(No));
    }
}
