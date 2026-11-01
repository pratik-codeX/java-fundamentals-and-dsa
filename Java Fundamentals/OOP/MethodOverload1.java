class Arithematic
{
    int Addition(int no1, int no2)
    {
        return no1+no2;
    }

    float Addition(float no1, float no2)
    {
        return no1+no2;
    }
    
    int Addition(int no1, int no2,int no3)
    {
        return no1+no2+no3;
    }
}

public class MethodOverload1 {
    public static void main(String[] args) 
    {
        Arithematic aobj = new Arithematic();

        System.out.println(aobj.Addition(10, 20));
        System.out.println(aobj.Addition(10.1f, 20.2f));
        System.out.println(aobj.Addition(10, 20,30));
        
    }
}
