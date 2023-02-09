import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int a,b;
        

    }

    static void ReverseNo(){

        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = s.nextInt();
        int x= 0;
        while( a!=0 ){
            x=x*10 + a%10;
            a= a/10;
        }

    
        System.out.println("Reverse is :" + x);

    }

    static void ReverseString(){


    }

}
