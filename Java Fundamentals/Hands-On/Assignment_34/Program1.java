/*Write a program which displays ASCII table. Table contains symbol,
Decimal, Hexadecimal and Octal representation of every member from
0 to 255.*/

class Logic
{
    void DisplayASCII(char ch)
    {
        int Hexadecimal = 0;
        
        boolean flag = false;
       if(ch >= '0' && ch <= '0x')
       {
            System.out.println(ch);
       }
       
      

    }   

}

public class Program1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        
        System.out.println(obj.ChkAlpha('#'));
    }
}
