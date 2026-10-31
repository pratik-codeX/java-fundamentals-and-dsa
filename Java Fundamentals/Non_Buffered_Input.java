import java.util.Scanner;

class Non_Buffered_Input 
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter you name : ");
        String name = sobj.nextLine();
        
        System.out.println("Enter you Age : ");
        int Age = sobj.nextInt();

        System.out.println("Enter you salary : ");
        float Salary = sobj.nextFloat();
        
        System.out.println(name+"\n"+Age+"\n"+Salary+"\n");
        sobj.nextLine();
    }    
}
