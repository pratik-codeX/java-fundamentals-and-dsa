class Base
{
    public String name;
    private int id;

    Base()
    {
        this.name = getClass().getName() +  " : Pratik";
        this.id = 11;
    }
}

class Derived extends Base
{   
    int name;
    void Display()
    {
        //System.out.println(super.id); 
        System.out.println(super.name); 
    }
} 

class Abstration {
    static public void main(String[] args) 
    {
        Derived eobj = new Derived();

        eobj.Display();    
    }
}
