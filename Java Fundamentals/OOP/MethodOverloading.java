class Arithemetic
{
    void Addition(int A, int B, int C)
    {
       System.out.println(A + B + C);
    }

    void Addition(float A, float B, float C)
    {
       System.out.println(A + B + C);
    }
}

public class MethodOverloading 
{
    public static void main(String[] args) {
         Arithemetic aobj = new Arithemetic();
   
         aobj.Addition(10,20,30);
         aobj.Addition(10.1f,20.3f,30.1f);
    }
}
