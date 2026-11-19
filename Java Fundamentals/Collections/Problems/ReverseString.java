public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "Pratiksha";

        String rev = "";

        for(int i = 0;i < str.length();i++)
        {
            System.out.println(str.charAt(i));
            char c = str.charAt(i);

            rev = c + rev;
        }
        System.out.println(rev);
    }    
}
