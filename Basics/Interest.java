//Program to Calculate Simple Interest

import java.util.Scanner;
public class Interest
{    public static void main(String args[]) 
    {
        System.out.println("Enter Principle Rate");
        Scanner p=new Scanner(System.in);
        float p1 =p.nextInt();
        System.out.println("Enter Interest Rate in %");
        Scanner i=new Scanner(System.in);
        float i1 =i.nextFloat();
        System.out.println("Times in Year");
        Scanner t=new Scanner(System.in);
        float t1 =t.nextFloat();
        float s= p1*(i1/100)*t1;
        System.out.println(s);
    }
}
