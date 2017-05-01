package javase01.t02;

import java.util.Scanner;
/**
 * Created by Izkon on 01.05.2017.
 */
public class FindMin {
    public static void main(String[] args) {
        int i = 1;
        double currentValue;

        System.out.println ("Input epsilon: ");
        Scanner in = new Scanner (System.in);
        double epsilon = in.nextDouble();

        do {
            i = i + 1;
            currentValue = 1 / Math.pow(i + 1, 2);
            System.out.println("a[" + i + "]=" + currentValue);

        } while (currentValue >= epsilon);
        System.out.println("Min value of element is " + i);
    }
}
