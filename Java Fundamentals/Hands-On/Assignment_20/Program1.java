//Write a program to nd the sum of all even numbers up to N.

class Logic
{
    void sumEvenNumbers(int num)
    {
        int sum = 0;
    
        for(int i = 0;i <= num;i++)
        {
            if(i % 2 == 0)
            {
                sum = i+sum;
            }
        }
        
        System.out.println(sum);
    }
}

public class Program1
{
    
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.sumEvenNumbers(10);
    }
}
