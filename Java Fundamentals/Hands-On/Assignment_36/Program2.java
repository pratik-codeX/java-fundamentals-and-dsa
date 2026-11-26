/*
2.Write a program which accept string from user and convert it into
upper case.

Input :“Marvellous Multi OS”
Output :MARVELLOUS MULTI OS

 */

import java.util.Scanner;

class Logic
{
    void struprx(String str)
    {
       int count = 0;
       char ch[] = str.toCharArray();

       for(int i = 0;i < str.length();i++)
       {
            if(ch[i] >=  'a' && ch[i] <= 'z')
            {
                ch[i] = (char)(ch[i]-32);
            }
       }
       System.out.println(ch);
    }
}

public class Program2
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
        String ch = sob.nextLine();

        obj.struprx(ch);
    }
}