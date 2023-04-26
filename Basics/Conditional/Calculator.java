import java.util.Scanner;
public class Calculator
{    public static void main(String args[]) 
    {
        System.out.println("Enter 1st Number");
        Scanner p=new Scanner(System.in);
        float a =p.nextInt();
        System.out.println("Enter 2nd Number");
        Scanner i=new Scanner(System.in);
        float b =i.nextFloat();
        System.out.println("Select +, -, *, / ");
        Scanner t=new Scanner(System.in);
        char c = t.next().charAt(0);
        if(c=='+'){
            float add=a+b;
            System.out.println("Sum of "+a+" and "+b+" = " +add);

        }else if(c=='-'){
            float sub=a-b;
            System.out.println("Subtraction of "+a+" and "+b+" = " +sub);

        }else if(c=='*'){
            float mul=a*b;
            System.out.println("Multiplication of "+a+" and "+b+" = " +mul);

        }else if(c=='/'){
            float div=a/b;
            System.out.println("Dividion of "+a+" by "+b+" = " +div);

        }
        else{
            System.out.println("Wrong Input");
        }
        
    }
}