class Arithemetic
{
    int no1, no2;

    Arithemetic(int a, int b)
    {
        this.no1 = a;
        this.no2 = b;
    }

     int Addition()
    {
        return this.no1 + this.no2;
    }
}

class Encapsulation
{
    public static void main(String[] a) 
    {
       Arithemetic aobj = new Arithemetic(11, 21);
       
       System.out.println("Addition is : "+ aobj.Addition());
    }
}
