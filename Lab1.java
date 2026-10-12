
package Src;

import java.util.Locale;

public class Lab1 {
    public static double calculate(int r, double x) {

        if (r == 21) {
            return Math.tan(Math.asin((x - 3) / 18));

        } else if (r == 7 || r == 9 || r == 11 ||
                r == 17 || r == 19) {

            return Math.tan(Math.cos(Math.exp(x)));

        } else {
            double a = (Math.cbrt(x) + 1) /
                    ((x + 2.0 / 3.0) / x);

            return Math.pow(
                    2 * Math.atan(
                            1 / Math.exp(Math.pow(Math.sin(a), 2))
                    ), 2
            );
        }
    }
    // matrix
    public static void printMatrix(double[][] c) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 18; j++) {
                System.out.printf("%.2f ", c[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // Array r
        int[] r = new int[11];

        for (int i = 0; i < 11; i++) {
            r[i] = 2 * i + 1;
        }
        // Array x
        double[] x = new double[18];

        for (int j = 0; j < 18; j++) {
            x[j] = -12 + Math.random() * 18;
        }
        // Matrix c
        double[][] c = new double[11][18];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 18; j++) {
                c[i][j] = calculate(r[i], x[j]);
            }
        }
        printMatrix(c);
    }
}
