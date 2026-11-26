/*
Write a program which accept string from user and display it inn
reverse order.
Input :“MarvellouS”
Output :“SuollevraM”
*/

class Logic
{
    void Reverse(String str)
    {
        char ch[] = str.toCharArray();

        int len = ch.length - 1;

        while(len >= 0)
        {
            System.out.println(ch[len]);
            len--;
        }
    }   
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.Reverse("Pratiksha");
    }
}