/*
2. Write a recursive program which display below pattern.

Output :

1   2   3   4   5
*/

class Logic
{
    //static int i = 1;
    void Display(int i)
    {
        if(i > 5)
        {
            System.out.println();
            return;
        }
            System.out.print(i+" ");
            i++;
            Display(i);
    }
}
public class Program2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        
        obj.Display(1);
    }
}