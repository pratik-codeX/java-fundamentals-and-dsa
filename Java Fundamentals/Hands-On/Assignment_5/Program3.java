//3.Check Leap Year.

public class Program3
{
    public static void CheckLeapYear(int year)
    {
        if(year % 4 == 0)
        {
            System.out.println("Its Leap Year");
        }
        else
        {
            System.out.println("Its not leap year"+year);
        }
    }
    public static void main(String[] args) 
    {
        int year = 2005;

        CheckLeapYear(year);
    }
}
