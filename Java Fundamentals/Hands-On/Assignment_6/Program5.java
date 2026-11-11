//5.Write a program which accept total marks & obtained marks from user and
//calculate percentage.


import java.util.Scanner;

public class Program5
{
    public static float Percentage(int total,int A)
    {
        int Percentage = (total / A) * 100;

        return Percentage;
    }
    public static void main(String[] args) 
    {
        System.out.println(Percentage(100,70));
    }
}