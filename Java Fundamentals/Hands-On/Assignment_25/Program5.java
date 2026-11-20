//.Accept N numbers from user and display all such elements which are
//multiples of 11.

import java.util.Scanner;

class Logic
{
    void Display(int arr[])
    {
        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i] % 11 == 0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        int Arr[] = new int[5];
        Scanner sobj = new Scanner(System.in);

        for(int i = 0; i < Arr.length;i++)
        {
            System.out.print("Enter Element "+i+" :");
            Arr[i] = sobj.nextInt();
        }
        obj.Display(Arr);
    }
}