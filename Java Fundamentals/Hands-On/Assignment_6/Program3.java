//3.Write a program which accept two numbers and check whether numbers are
//equal or not.

public class Program3
{
    public static void ChkEqual(int No1,int No2)
    {
        if(No1 == No2)
        {
            System.out.println("Its Equal");
        }
        else
        {
            System.out.println("Its not Equal");
        }
    }
    public static void main(String[] args) 
    {
        ChkEqual(10,10);
    }
}
