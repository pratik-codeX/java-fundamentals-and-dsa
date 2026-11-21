//Accept number from user and display below pattern.
/*

 */

import java.util.Scanner;

class Logic
{
    void Pattern(int iCol,int iRow)
    {

        while(iRow != 0)
        {
            char ch = 'A';

            int temp = iCol;
            while(temp != 0)
            {
                System.out.print(ch+" ");
                temp--;
                ch++;
            }
            System.out.println();
            iRow--;
        }
    }
}

public class Program1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        
        obj.Pattern(4,4);
    }
}
