//. Accept N numbers from user and display all such numbers which contains
//3 digits in it.

import java.util.Scanner;

class Logic
{
    void Digits(int arr[])
    {
        int digit = 0;
        for(int i = 0;i < arr.length;i++)
        {
            while(arr[i] != 0)
            {
                digit = arr[i] % 10;

                if(digit == 3)
                {
                    System.out.println(arr[i]);
                    break;
                }
                arr[i] = arr[i] / 10;
            }
        }
    }
}

public class Program4
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
        
        obj.Digits(Arr);
        
    }
}
