/*
2. Write a program which accept string from user and copy that
characters of that string into another string by removing all white
spaces.

Input: "Marvel lous Pyth on"
Output: “MarvellousPython”

 */

import java.util.Scanner;

class Logic
{
    void StrCpyX(String str)
    {
        char ch[] = str.toCharArray();
        String rev = "";

        for(int i = 0;i< str.length();i++)
        {
            if(ch[i] != ' ')
            {
                rev = rev+ch[i]; 
            }
        }
        System.out.println(rev);
    }
}
public class Program2
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
        System.out.println("Enter String  :");
        String ch = sob.nextLine();

        obj.StrCpyX(ch);
    }
}