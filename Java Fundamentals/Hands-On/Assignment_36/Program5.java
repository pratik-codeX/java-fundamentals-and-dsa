/*
5. Write a program which accept string from user and count number of
white spaces
Input :“MarvellouS”
Output : 0

Input :“MarvellouS Info”
Output : 1

*/

class Logic
{
    int CountWhite(String str)
    {
        char ch[] = str.toCharArray();

        int len = ch.length - 1;
        int count = 0;

        while(len >= 0)
        {
            if(ch[len] == ' ')
            {
                count++;
            }
            len--;
        }
        return count;
    }   
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        System.out.println(obj.CountWhite("Pratiksha Pare"));
    }
}