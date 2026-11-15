//5.Write a program to calculate the power of a number using loops.

class Logic
{
    void calculatePower(int base, int exp)
    {
        int power = 1;
        for(int i = 1; i <= exp;i++)
        {
            power = power * base;
        }
        System.out.println(base +" to the Power of "+exp+" is "+power);
    }
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.calculatePower(3,4);
    }
}
