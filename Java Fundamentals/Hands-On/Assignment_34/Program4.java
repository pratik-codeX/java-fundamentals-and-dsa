/*
Accept Character from user and check whether it is special symbol
or not (!, @, #, $, %, ^, &, *).
 */

class Logic
{
    boolean ChkSpecial(char ch)
    {
        boolean flag = false;
       if(ch >= 32 && ch <= 42)
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

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        System.out.println(obj.ChkSpecial('a') ? "Its Special" : "Its Not Special");
    }
}
