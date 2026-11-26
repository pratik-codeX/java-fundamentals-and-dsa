/*
4.Write a program which accept string from user and accept one
character. Return index of last occurrence of that character.
Input :
“Marvellous Multi OS”
M
Output :11
Input :“Marvellous Multi OS”
W
Output :-1
Input :“Marvellous Multi OS”
e
Output :
4

 */

class Logic
{
    int DisplayDigit(String str,char c)
    {
        char ch[] = str.toCharArray();
        int idx = -1;

        for(int i = 0;i < ch.length;i++)
        {
            if(ch[i] == c)
            {
                idx = i;
            }
        }
        return idx;
    }   
}

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        System.out.println(obj.DisplayDigit("HEollo12332",'o'));
    }
}
