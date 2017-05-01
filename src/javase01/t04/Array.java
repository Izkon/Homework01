package javase01.t04;

import java.util.Scanner;
/**
 * Created by Izkon on 01.05.2017.
 */
public class Array {
    public static void main(String[] args) {
        System.out.println ("Input number of elements in the sequence n > 1: ");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();

        double[] array = new double [n];


        for (int i=0; i < n; i++) {
            System.out.println("Input an element in the sequence a: ");
            array[i] = in.nextDouble();
        }

        double [] newArray = new double [n];

        for (int j=0; j < n; j++) {
            newArray[j] = array[j] + array[n - j - 1];
        }
        double max=newArray[0];
        for (int j = 1; j < n; j++) {
            if (newArray [j] > max) {
                max = newArray [j];
            }
        }

        System.out.println("Max value is " + max);

    }
}
