class Base 
{
    Base()
    {
        System.out.println("inside base");
    }
}

class Derived extends  Base
{
    Derived()
    {
        System.out.println("Inside Derived");
    }
}

public class SingleInheritance 
{
    public static void main(String[] args) 
    {
        Base boj = new Derived(); 
    }    
}
