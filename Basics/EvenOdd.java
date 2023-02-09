//Write a program to check given number is odd or even.

import java.util.Scanner;

public class EvenOdd{    
    public static void main(String args[]) {
        int a,b;
        Scanner a1 = new Scanner(System.in);
        a=a1.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
              
    }
}
