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
    int FirstChar(String str,char c)
    {
       char ch[] = str.toCharArray();
        int idx = -1;
       for(int i = 0;i < str.length();i++)
       {
            if(ch[i] == c)
            {
                return i;
            }
        }
        return idx;
    }
}

public class Program3
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
        String s = sob.nextLine();
        char c = sob.next().charAt(0);

        System.out.println(obj.FirstChar(s,c));
    }
}
