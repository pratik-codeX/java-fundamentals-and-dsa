/*
4. Write a program which accept string from user and display only
digits from that string.

Input :“marve89llous121”
Output :89121
Input :“Demo”
Output:

 */

class Logic
{
    void DisplayDigit(String str)
    {
       
        char ch[] = str.toCharArray();

        for(int i = 0;i < ch.length;i++)
        {
            if(ch[i] >= '0' && ch[i] <= '9')
            {
                System.out.print(ch[i]);
            }
        }
        
    }   
}

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.DisplayDigit("HEllo12332");
    }
}
