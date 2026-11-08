//5. Accept on character from user and check whether that character is vowel
//(a,e,i,o,u) or not.
import java.util.Scanner;

public class Program5
{
    public static boolean CheckVowel(char A)
    {
        if(A == 'a' || A == 'e' || A == 'i' || A == 'o' || A == 'u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        char Ch = sobj.next().charAt(0);

        if(CheckVowel(Ch))
        {
            System.out.println("Its Vowel");
        }
        else
        {
            System.out.println("Its not Vowel");
        }
    }
}
