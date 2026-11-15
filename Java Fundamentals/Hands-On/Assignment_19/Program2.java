//2.Write a program to display the grade of a student based on marks.

import java.util.Scanner;

class Logic
{
    void displayGrade(int n)
    {
        if(n > 100)
        {
            System.out.println("Invalid Marks");
            return;
        }

        if(n < 0)
        {
            n = -n;
        }
        
        if(n >= 70)
        {
            System.out.println("A Grade");
        }
        else if(n < 80 && n >= 60)
        {
            System.out.println("B Grade");
        }
        else if(n >= 35 && n < 60)
        {
            System.out.println("C Grade");
        }
        else
        {
            System.out.println("F Grade");
        }
    }  
}
public class Program2
{
   
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Marks : ");
        int num = sobj.nextInt();

        obj.displayGrade(num);
    }
}