/*
Write a program which accept string from user and toggle the case.

Input :“Marvellous Multi OS”
Output :mARVELLOUS mULTI os

 */

import java.util.Scanner;

class Logic
{
    void strtogglex(String str)
    {
       int countCap = 0;
       int countSmall = 0;

       char ch[] = str.toCharArray();

       for(int i = 0;i < str.length();i++)
       {
            if(ch[i] >=  'A' && ch[i] <= 'Z')
            {
                ch[i] = (char)(ch[i]+32);
            }
            else if(ch[i] >= 'a' && ch[i] <= 'z')
            {
                ch[i] = (char)(ch[i]-32);
            }
        }
        System.out.println(ch);
    }
}

public class Program3
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
        String s = sob.nextLine();

        obj.strtogglex(s);
    }
}
