/*
2. Write a recursive program which display below pattern.
Output :
A   B   C   D   E   F
 */

class Logic
{
    void display(char c)
    { 
        if(c == 'G')
        {
            System.out.println();
            return;
        }

        System.out.print(c+" ");
        c =(char)(c+1);
        display(c);
    }   
}

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

       obj.display('A');

       //char c = 'A';
       //c = (char)(c+1);
       //System.out.print(c);
    }
}
