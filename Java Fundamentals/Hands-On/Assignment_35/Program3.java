/*
Write a program which accept string from user and return
difference between frequency of small characters and frequency of
capital characters.
Input :“MarvellouS”
Output :6
(8-2)
 */

import java.util.Scanner;

class Logic
{
    int Difference(String str)
    {
       int countCap = 0;
       int countSmall = 0;

       char ch[] = str.toCharArray();

       for(int i = 0;i < str.length();i++)
       {
            if(ch[i] >=  'a' && ch[i] <= 'z')
            {
                countSmall++;
            }
            else
            {
                countCap++;
            }
        }
       return countSmall-countCap;
    }
}

public class Program3
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
        String s = sob.nextLine();

        System.out.println(obj.Difference(s));
    }
}
