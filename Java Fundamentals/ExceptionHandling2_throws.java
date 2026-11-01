class Arithematic 
{
    void Division(int A, int B) throws Exception
    {
        float div = B / A;
    }
}

class ExceptionHandling2_throws
{
    public static void main(String[] args) 
    {
        Arithematic aobj = new Arithematic(); 
        try
        {
            aobj.Division(0, 10); 
        }
        catch(Exception e)
        {
            System.out.println("Exceptio occured as : "+e);
        }
    }    
}
