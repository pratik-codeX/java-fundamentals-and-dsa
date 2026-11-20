//Accept number from user and display below pattern.
/*
54321
54321
54321
*/

import java.util.Scanner;

class Logic
{
     void Pattern(int iCol,int iRow)
    {
        while(iRow != 0)
        {
            int temp = iCol;
            while(temp != 0)
            {
                System.out.print(" "+temp+" ");
                temp--;
            }
            System.out.println();
            iRow--;
        }
    }
}

public class Program3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.Pattern(5,3);
    }
}
