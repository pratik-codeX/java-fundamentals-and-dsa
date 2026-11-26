/*
Write a program which accept string from user and copy that
characters of that string into another string by toggling the case.

Input :“Marvellous Python 2”
Output :“mARVELLOUS pYTHON 2”

*/

class Logic
{
    void StrCpyToggle(String str)
    {
        char ch[] = str.toCharArray();
        String s = "";

        for(int i = 0;i < ch.length;i++)
        {
            if(ch[i] >= 'A' && ch[i] <= 'Z')
            {
                ch[i] = (char)(ch[i]+32);

                s = s+ch[i];
            }
            else
            {
                ch[i] = (char)(ch[i]-32);
                s = s+ch[i];
            }
        }
        System.out.println(s);
    }  
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.StrCpyToggle("Marvellous Python 2");
    }
}