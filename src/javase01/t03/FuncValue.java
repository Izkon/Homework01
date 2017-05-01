package javase01.t03;

import java.util.Scanner;
/**
 * Created by Izkon on 01.05.2017.
 */
public class FuncValue {
    public static void main(String[] args) {
        System.out.println ("Input a: ");
        Scanner in = new Scanner (System.in);
        double a = in.nextDouble();

        System.out.println ("Input b: ");
        double b = in.nextDouble();

        System.out.println ("Input step h: ");
        double h = in.nextDouble();

        for (double x = a; x < b; x = x + h) {
            double fX = Math.tan (2*x) - 3;
            System.out.printf ("|| %15.10f || %15.10f ||\n", x, fX);
        }
    }
}
