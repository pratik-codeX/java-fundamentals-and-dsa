//Accept number from user and display below pattern.
/*

 */
import java.util.Scanner;
class Logic
{
    void Display(char ch)
    {
       if(ch >= 65 && ch <= 90)
       {
            System.out.println((char)(ch+32));
       }
       else
       {
        System.out.println(ch);
       }
    }
}

public class Program2
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
        char ch = sob.next().charAt(0);

        obj.Display(ch);
    }
}