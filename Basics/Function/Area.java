import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Circle(2);
        Triangle(4, 5);
        Rectangle(4, 4);
        Isosceles(4, 5);
        Parallelogram(4, 5);
        Rhombus(5, 5);
        EquilateralTriangle(17);

    }

    static double Circle(double rad) {
        double c = Math.PI * rad * rad;
        System.out.println(c);
        return 0;
    }

    static int Triangle(double base, double height) {
        double t = (base * height) / 2;
        System.out.println(t);
        return 0;
    }

    static int Rectangle(double width, double length) {
        double r = width * length;
        System.out.println(r);
        return 0;
    }

    static int Isosceles(double base, double height) {
        double i = (base * height) / 2;
        System.out.println(i);
        return 0;
    }

    static int Parallelogram(double base, double height) {
        double p = (base * height);
        System.out.println(p);
        return 0;
    }

    static int Rhombus(double d1, double d2) {
        double r = (d1 * d2) / 2;
        System.out.println(r);
        return 0;
    }

    static int EquilateralTriangle(double a) {
        double e = (1.73 * a * a) / 4; // root 3 = 1.73
        System.out.println(e);
        return 0;
    }

}
