package javase01.t05;

import java.util.Scanner;
/**
 * Created by Izkon on 01.05.2017.
 */
public class DoubleArray {
    public static void main(String[] args) {
        System.out.println ("Input size of the matrix n > 1: ");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix [i][i] = 1;
            matrix [i][n-i-1]=1;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
}
