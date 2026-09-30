package Src;

import java.util.Locale;

public class Lab1 {

    public static double calculateElement(int r, double x) {

        if (r == 21) {
            return Math.tan(
                    Math.asin((x - 3) / 18)
            );
        }

        else if (
                r == 7 ||
                        r == 9 ||
                        r == 11 ||
                        r == 17 ||
                        r == 19
        ) {
            return Math.tan(
                    Math.cos(
                            Math.exp(x)
                    )
            );
        }

        else {
            double exponent =
                    (Math.cbrt(x) + 1) /
                            ((x + 2.0 / 3.0) / x);

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

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Array r
        int[] r = new int[11];

        for (int i = 0; i < r.length; i++) {
            r[i] = 2 * i + 1;
        }

        // Array x
        double[] x = new double[18];

        for (int i = 0; i < x.length; i++) {

            do {
                x[i] = -12 + Math.random() * 18;
            } while (x[i] == 0);
        }

        //Matrix c
        double[][] c = new double[11][18];

        for (int i = 0; i < 11; i++) {

            for (int j = 0; j < 18; j++) {

                c[i][j] = calculateElement(r[i], x[j]);
            }
        }

        // Print matrix c
        for (int i = 0; i < 11; i++) {

            for (int j = 0; j < 18; j++) {

                System.out.printf(
                        "%.2f ",
                        c[i][j]
                );
            }

            System.out.println();
        }
    }
}
