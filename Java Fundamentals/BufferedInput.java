import java.io.BufferedReader;
import java.io.InputStreamReader;

class BufferedInput 
{
    public static void main(String[] args) 
    {    
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));   
        
        String name = null;
        String no = null;
        
        try
        {
            System.out.println("Enter Name  : ");
            name =  bobj.readLine();  
            System.out.println("Enter Number  : ");
            no = bobj.readLine();   
        }
        catch(Exception e)
        {
            System.out.println("Exception is solve this : "+e);
        }
        System.out.println("Name is : "+name);
        System.out.println(Integer.parseInt(no));
    }
}