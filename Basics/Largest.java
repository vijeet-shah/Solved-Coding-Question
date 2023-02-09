import java.util.Scanner;
public class Largest
{    public static void main(String args[]) 
    {
        System.out.println("Enter 1st Interger");
        Scanner a = new Scanner(System.in);
        int x= a.nextInt();
        System.out.println("Enter 2nd Interger");
        Scanner b = new Scanner(System.in);
        int y= b.nextInt();

        if(x>y){
            System.out.println(x+" is Greater than "+y);
        }else{
            System.out.println(y+" is Greater than "+x);
        }     
    }
}