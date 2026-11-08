//4. Accept one character from user and convert case of that character.

import java.util.Scanner;

public class Program4
{
    public static void DisplayConvert(char A)
    {
       if('A' >= A && 'Z' >= A)
       {
            System.out.println((char)A+32);
       }
       else if('a' >= A && 'z' >= A)
       {
            System.out.println(A-32);
       }
       
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Character : ");
        
        char ch = sobj.next().charAt(0);
       DisplayConvert(ch);
    }
}
