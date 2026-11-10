//5.Find Largest Among Three Numbers.
import java.util.Scanner;

public class Program5
{
    public static void FindLargest(int A, int B, int C)
    {
        if(A > B && A > C)
        {
            System.out.println(A+"is Greater than Among");
        }
        else if(B > A && B > C)
        {
            System.out.println(B+" is Greater than Among");
        }
        else
        {
            System.out.println(C+" is Greater than Among");
        }
    }
    public static void main(String[] args) 
    {
        FindLargest(10,30,40);
    }
}
