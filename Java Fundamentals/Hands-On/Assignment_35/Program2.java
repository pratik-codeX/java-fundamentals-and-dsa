/*
Write a program which accept string from user and count number of
small characters.
Input :“Marvellous”
Output :9
 */

import java.util.Scanner;

class Logic
{
    int CountCapital(String str)
    {
       int count = 0;
       char ch[] = str.toCharArray();

       for(int i = 0;i < str.length();i++)
       {
            if(ch[i] >=  'a' && ch[i] <= 'z')
            {
                count++;
            }
       }
       return count;
    }
}

public class Program2
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
        String ch = sob.nextLine();

        System.out.println(obj.CountCapital(ch));
    }
}