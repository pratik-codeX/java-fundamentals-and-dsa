//1.Write a program which accept name from user and print that name.
import java.util.Scanner;

public class Program1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Your Name");
        
        String name = sobj.nextLine();

        System.out.println(name);
    }
}
