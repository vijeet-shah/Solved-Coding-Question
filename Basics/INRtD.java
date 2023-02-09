import java.util.Scanner;
public class INRtD
{    public static void main(String args[]) 
    {
        double a,b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Currency in INR ");
        a = s.nextFloat();
        b = a/73.77;
        System.out.println("Converted to Dollar :" +  String.format("%.2f",b));
        
    }
}