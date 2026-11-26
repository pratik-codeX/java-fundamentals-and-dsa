/*
.Write a program which accept string from user and accept one
character. Return index of first occurrence of that character.

Input :
“Marvellous Multi OS”
M
0

Input :
“Marvellous Multi OS”
W
Output :-1

Input :“Marvellous Multi OS”
e
Output :
4

 */

import java.util.Scanner;

class Logic
{
    String StrCpyCap(String str,String newstr)
    {
       char ch[] = str.toCharArray();

       for(int i = 0;i < str.length();i++)
       {
            if(ch[i] >= 'a' && ch[i] <= 'z')
            {
                ch[i] = (char)(ch[i]-32);
                newstr = newstr+ch[i];
            }
            else
            {
                newstr = newstr+ch[i];
            }
        }
        return newstr;
    }
}

public class Program3
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
        String s = sob.nextLine();
        String newstr = new String();

       newstr =  obj.StrCpyCap(s,newstr);

        System.out.println(newstr);
    }
}
