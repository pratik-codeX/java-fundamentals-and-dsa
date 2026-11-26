/*
Write a program which accept string from user reverse that string
in place.

Input :“abcd”
Output :“dcba”

Input :“abba”
Output :“abba”

*/

class Logic
{
    void StrRevX(String str)
    {
        char ch[] = str.toCharArray();

        int leftPointer = 0 ;
        int rightPointer = ch.length - 1;

        while(leftPointer <= rightPointer)
        {
            char temp = ch[leftPointer];
            ch[leftPointer] = ch[rightPointer];
            ch[rightPointer] = temp;

            leftPointer++;
            rightPointer--;
            
        }
        str = new String(ch);
        System.out.println(str);
    }   
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.StrRevX("Pratikshaa");
    }
}