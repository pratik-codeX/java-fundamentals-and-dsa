/*
2.Write a program which accept string from user and accept one
character. Return frequency of that character.

Input :
“Marvellous Multi OS”
M
Output :2
Input :“Marvellous Multi OS”
W
0

 */

import java.util.Scanner;

class Logic
{
  int CountChar(String str,char c)
    {
       char ch[] = str.toCharArray();
       int frequency = 0;

       for(int i = 0;i < str.length();i++)
       {
            if(ch[i] ==  c)
            {
                frequency++;
            }
       }  
       return frequency;
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

        System.out.println("Enter Character : ");
        char c = sob.next().charAt(0);

        System.out.println("frequency is: "+obj.CountChar(ch,c));
    }
}