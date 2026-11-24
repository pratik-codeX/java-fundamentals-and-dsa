//Accept number from user and display below pattern.
/*

 */

class Logic
{
    boolean ChkAlpha(char ch)
    {
        boolean flag = false;
       if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
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

public class Program1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        
        System.out.println(obj.ChkAlpha('#'));
    }
}
