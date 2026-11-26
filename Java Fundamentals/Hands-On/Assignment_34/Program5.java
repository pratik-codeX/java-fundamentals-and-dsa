/*
Accept character from user and display its ASCII value in decimal,
octal and hexadecimal format.
*/

class Logic
{
    void Display(char ch)
    {
        System.out.println("Hexadecimal is :"+Integer.toHexString(ch));
        System.out.println("Octal is : "+Integer.toOctalString(ch));
        System.out.println("Decimal is : "+(int)ch);
    }   
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.Display('N');
    }
}