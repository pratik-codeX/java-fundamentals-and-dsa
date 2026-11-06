//1.Program to divide two numbers

class Arithemetic
{
    public int Divide(int A,int B)
    {
        return A / B;
    }
}

public class Program1
{
    public static void main(String[] args) 
    {
        Arithemetic aobj = new Arithemetic();
        int iRet = aobj.Divide(10,5);

        System.out.println("Division is : "+iRet);
    }
}
