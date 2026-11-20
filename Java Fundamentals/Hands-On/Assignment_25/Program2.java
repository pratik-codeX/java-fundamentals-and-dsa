//Accept N numbers from user and display all such elements which are
//divisible by 5.

import java.util.Scanner;

class Logic
{
    void Display(int arr[])
    {
        int iMin = arr[0];
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] % 5 == 0)
            {
                System.out.println(arr[i]);
            }
        } 
    }
}

public class Program2
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
