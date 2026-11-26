/*
Write a program which accept string from user and copy that
characters of that string into another string in reverse order.

Input :“Marvellous Python”
Output :“nohtyP suollevraM”

*/

import java.util.Scanner;

class Logic
{
    void StrCpyRev(String str)
    {
        char ch[] = str.toCharArray();
        String rev = "";

        for(int i = 0;i< str.length();i++)
        {
            rev = ch[i]+rev;
        }
        System.out.println(rev);
    }
}

public class Program1
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
        String ch = sob.nextLine();

       obj.StrCpyRev(ch);
    }
}