/*
1.Write a program which accept string from user and accept one
character. Check whether that character is present in string or not.

Input :
“Marvellous Multi OS”
e
Output :TRUE

Input :“Marvellous Multi OS”
W
Output :
FALSE

*/

import java.util.Scanner;

class Logic
{
    boolean ChkChar(String str,char c)
    {
       char ch[] = str.toCharArray();
       boolean flag = false;

       for(int i = 0;i < str.length();i++)
       {
            if(ch[i] ==  c)
            {
                flag = true;
                return flag;
            }
       }  
       return flag;
    }
}

public class Program1
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
        String ch = sob.nextLine();
        char c = sob.next().charAt(0);

       System.out.println(obj.ChkChar(ch,c) ? "Present" : "Not Present");
    }
}