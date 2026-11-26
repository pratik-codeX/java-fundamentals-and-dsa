/*
Write a program which accept string from user and count number of
capital characters.
Input :“Marvellous Multi OS”
Output :4
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
            if(ch[i] >=  'A' && ch[i] <= 'Z')
            {
                count++;
            }
       }
       return count;
    }
}

public class Program1
{
    public static void main(String[] args) 
    {
        Scanner sob = new Scanner(System.in);
        Logic obj = new Logic();
        String ch = sob.nextLine();

        System.out.println(obj.CountCapital(ch));
    }
}