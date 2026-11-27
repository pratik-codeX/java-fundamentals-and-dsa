/*
Write a program which accept string from user and copy that
characters of that string into another string by toggling the case.

Input :“Marvellous Python 2”
Output :“mARVELLOUS pYTHON 2”

*/

class Logic
{
    void Display(char c)
    {
        if(c == 'g')
        {
            System.out.println();
            return;
        }

        System.out.print(c+" ");
        c = (char)(c+1);
        Display(c);
    }  
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.Display('a');
    }
}