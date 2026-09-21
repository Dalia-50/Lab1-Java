package Src;

import java.util.Locale;

public class Lab1 {
    // Calculate one element of the matrix
    public static double calculateElement(int rValue, double xValue) {
        if (rValue == 21) {

            return Math.tan(
                    Math.asin((xValue - 3) / 18)
            );

        }

        // If r[i] belongs to {7, 9, 11, 17, 19}
        else if (
                rValue == 7 ||
                        rValue == 9 ||
                        rValue == 11 ||
                        rValue == 17 ||
                        rValue == 19
        ) {

            return Math.tan(
                    Math.cos(
                            Math.exp(xValue)
                    )
            );

        }

        // For all other values of r[i]
        else {

            double exponent =
                    (Math.cbrt(xValue) + 1)
                            / ((xValue + 2.0 / 3.0) / xValue);

            return Math.pow(
                    2 * Math.atan(
                            1 / Math.pow(
                                    Math.sin(
                                            Math.exp(exponent)
                                    ),
                                    2
                            )
                    ),
                    2
            );
        }
    }

    // Print the first array
    public static void printFirstArray(int[] array) {

        System.out.println("First array:");

        System.out.print("[ ");

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" ]");
        System.out.println();
    }
    // Print the second array
    public static void printSecondArray(double[] array) {

        System.out.println("Second array:");

        for (int i = 0; i < array.length; i++) {

            System.out.printf(
                    Locale.US,
                    "%.4f ",
                    array[i]
            );
        }

        System.out.println();
        System.out.println();
    }
    // Print the third matrix
    public static void printMatrix(double[][] matrix) {

        System.out.println("Third matrix:");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.printf(
                        Locale.US,
                        "%.2f ",
                        matrix[i][j]
                );
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        // First array: r
        int[] r = new int[11];

        for (int i = 0; i < r.length; i++) {

            r[i] = 2 * i + 1;
        }
        // Second array: x
        double[] x = new double[18];

        for (int j = 0; j < x.length; j++) {

            do {

                x[j] = -12 + Math.random() * 18;

            } while (x[j] == 0.0);
        }
        // Third matrix: c

        double[][] c = new double[r.length][x.length];


        // Calculate every element of matrix c

        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < c[i].length; j++) {

                c[i][j] = calculateElement(r[i], x[j]);
            }
        }
        printFirstArray(r);
        printSecondArray(x);
        printMatrix(c);
    }
}