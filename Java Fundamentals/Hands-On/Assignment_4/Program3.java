//3.Write a program which accept number from user and display all its non factors.

public class Program3
{
    public static void NonFact(int no)
    {
        for(int i = 1; i < no/2; i++)
        {
            if(no % i != 0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) 
    {
        NonFact(40);
    }
}
