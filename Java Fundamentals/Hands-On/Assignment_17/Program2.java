//2.Write a program to check whether a number is a palindrome or not.

class Logic
{
    void checkPalindrome(int num)
    {
        int rev = 0;
        int temp = num;

        while(temp != 0)
        {
            rev = (temp % 10) + rev * 10;

            temp = temp / 10;
        }
        
        if(rev == num)
        {
            System.out.println("Its Palindrome");
        }
        else
        {
            System.out.println("Its Not Palindrome");
        }
    }   
}
public class Program2
{
   
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.checkPalindrome(111);
    }
}