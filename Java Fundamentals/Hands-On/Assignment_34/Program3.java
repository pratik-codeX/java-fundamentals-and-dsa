/*
Accept character from user. If it is capital then display all the
characters from the input characters till Z. If input character is small
then print all the characters in reverse order till a. In other cases
return directly.
 */

import java.util.Scanner;

class Logic
{
    void Display(char ch)
    {
        char c = ch;
        if(ch >= 'A' && ch <= 'Z')
        {
            while(c != 'Z')
            {
                c = (char)(ch++);
                System.out.println(c);
            }
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            while(c != 'a')
            {
                c = (char)(ch--);
                System.out.println(c);
            }
        }


        
    }  

}

public class Program3
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
        char ch = sob.next().charAt(0);

        obj.Display(ch);
    }
}
