//. Accept N numbers from user check whether that numbers contains 11 in
//it or not.

import java.util.Scanner;

class Logic
{
    boolean Check(int arr[])
    {
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] == 11)
            {
                return true;
            }
        }
        return false;
    }
}

public class Program3
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

        if(obj.Check(Arr))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");

        }
    }
}
