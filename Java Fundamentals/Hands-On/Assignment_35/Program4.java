/*
Write a program which accept string from user and check whether
it contains vowels in it or not.

Input :“marvellous”
Output :TRUE

Input :“Demo”
Output :TRUE

Input :“xyz”
Output :FALSE
 */

class Logic
{
    boolean ChkVowel(String str)
    {
        boolean flag = false;
        char ch[] = str.toCharArray();

        for(int i = 0;i < ch.length;i++)
        {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
            {
                flag = true;
                return flag;
            }
        }
        return flag;
    }   
}

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        System.out.println(obj.ChkVowel("Pratiksha") ? "Vowel Present" : "Vowel Not Present");
    }
}
