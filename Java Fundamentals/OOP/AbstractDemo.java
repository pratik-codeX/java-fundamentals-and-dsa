abstract class RBI
{
    abstract void ROI();
    
    void DisplayKYC()
    {
        System.out.println("RBI DisplayKYC");
    }
}

class SBI extends RBI
{
    String name;
    int Amount;

    SBI(String name, int Amount)
    {
        this.name = name;
        this.Amount = Amount;
    }

    void ROI()
    {
        System.out.println("SBI gives 9% of ROI for " + this.name);
    } 

    void DisplayKYC()
    {
        System.out.println("Name is : "+this.name+"\n Amount is : "+this.Amount);
    }
}

class BOM extends RBI
{
    String name;
    int Amount;

    BOM(String name, int Amount)
    {
        this.name = name;
        this.Amount = Amount;
    }

    void ROI()
    {
        System.out.println("SBI gives 5% of ROI for " + this.name);
    }

    void DisplayKYC()
    {
        System.out.println("Name is : "+this.name+"\n Amount is : "+this.Amount);
    }
}
class AbstractDemo 
{
    public static void main(String[] args) 
    {
        BOM bobj = new BOM("Pratik",50000);
        bobj.ROI();
        bobj.DisplayKYC();

        SBI sobj = new SBI("Pratiksha", 70000);
        sobj.DisplayKYC();
        sobj.ROI();

    }
}