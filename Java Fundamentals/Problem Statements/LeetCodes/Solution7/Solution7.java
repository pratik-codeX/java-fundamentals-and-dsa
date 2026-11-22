import java.util.Scanner;

public class Solution7 
{   
    public static int reverse(int x) 
    {
        int reverse = 0;
        //int real = 0;
        long result = 0;
        while(x != 0)
        {   
            result = (long)reverse * 10;
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            {
                //System.out.println("Overflowed");
                reverse = 0;
               return reverse;
            }
            else
            {
                reverse = reverse * 10 + x % 10;
            }

            x = x / 10;
        }
        
        return reverse;
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = s.nextInt();
        System.out.println(reverse(num));
    }
    
}
