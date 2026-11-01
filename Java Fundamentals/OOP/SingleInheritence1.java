class Base 
{
    static int no = 11;
    int n1 = 0;

    Base()
    {
        System.out.println("Base Constructor");
    }

    static void Addition()
    {
        System.out.println(10+11);
    }

    void Display()
    {
        System.out.println("Base Display");
    }
}

class Derived extends Base
{

    Derived()
    {
        System.out.println("Derived Constructor");
    }
    
    void Display()
    {
        System.out.println("Derived Display");
        System.out.print("Addition :");
        Base.Addition();

    }
}

class SingleInheritence1 
{
    public static void main(String[] args) 
    {
        Derived dobj = new Derived();

        dobj.Display();
    }
}
