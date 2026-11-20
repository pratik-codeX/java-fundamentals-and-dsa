//Accept number from user and display below pattern.
/*
123
123
123
*/

import java.util.Scanner;

class Logic
{
     void Pattern(int iCol,int iRow)
    {
        while(iRow != 0)
        {
            int temp = 1;
            while(temp <= iCol)
            {
                System.out.print(" "+temp+" ");
                temp++;
            }
            System.out.println();
            iRow--;
        }
    }
}

public class Program2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.Pattern(3,4);
    }
}
