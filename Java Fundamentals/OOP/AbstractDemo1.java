abstract class Demo
{
    abstract void Addition(int no1,int no2);

    int Substraction(int no1, int no2)
    {
        return no1 - no2;
    }
}

class Test extends Demo
{
    void Addition(int no1, int no2)
    {
        System.out.println("Method Body Completed");
    }
}

public class AbstractDemo1 
{
    public static void main(String[] args) 
    {
        Test obj = new Test();
        obj.Addition(11,22);
    }
}
