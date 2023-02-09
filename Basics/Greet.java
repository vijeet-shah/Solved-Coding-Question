//Write a program to Greet.

import java.util.Scanner;
public class Greet
{    public static void main(String args[]) 
    {
        System.out.println("Enter Your Name");
        Scanner a = new Scanner(System.in);
        String x= a.next();

        System.out.println("Hello"+ " "+ x +" "+"Welecome"+" "+x);       
    }
}
