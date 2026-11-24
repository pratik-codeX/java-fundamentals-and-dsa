//Accept number from user and display below pattern.
/*

 */

class Logic
{
    boolean ChkAlpha(char ch)
    {
        boolean flag = false;
       if(ch >= '0' && ch <= '9')
       {
            flag = true;
       }
       else
       {
            flag = false;
       }

       return flag;

    }   

}

public class Program3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        
        System.out.println(obj.ChkAlpha('1'));
    }
}
