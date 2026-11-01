class Arithematic 
{
    void Division(int A, int B)
    {
    try
    {
        float div = B / A;
    }
    catch(Exception e)
    {
        System.out.println("Fix the divisible : "+e);
    }
    }
}

class ExceptionHandling1 
{
    public static void main(String[] args) 
    {
        Arithematic aobj = new Arithematic(); 
        aobj.Division(0, 10);
    }    
}
