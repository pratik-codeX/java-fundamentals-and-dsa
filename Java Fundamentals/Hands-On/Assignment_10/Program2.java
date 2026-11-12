//2.Write a program which accept width & height of rectangle from user and calculate
//its area. (Area = Width * Height)

import java.util.Scanner;

public class Program2
{
    public static float RectArea(float fWidth,float fheight)
    {
        return fWidth * fheight;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        
        float height = sobj.nextFloat();
        float width = sobj.nextFloat();

        System.out.println(RectArea(width,height));
    }
}
