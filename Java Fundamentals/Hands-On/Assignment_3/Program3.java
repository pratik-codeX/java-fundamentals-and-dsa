//3.Write a program which accept number from user and print even factors of that
//number.

public class Program3
{
    public static void EvenFact(int no)
    {
        for(int i = 1;i < no;i++)
        {
            if((no % i == 0) && (i % 2 == 0))
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) 
    {
        EvenFact(36);
    }
}
