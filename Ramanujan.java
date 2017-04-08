// Ramanujan.java: Prints the integers <= N (command-line argument) that
// can be expressed as the sum of two distinct cubes.

import edu.princeton.cs.algs4.StdOut;

public class Ramanujan {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        for (int a = 0; a <= Math.cbrt(x); a++) {
            double num1 = a * a * a;
            for (int b = a+1; b <= Math.cbrt(x-(a * a * a)); b++) {
                double num2 = b * b * b;
                for (int c = a+1; c <= Math.cbrt(x); c++) {
                    double num3 = c * c * c;
                    for (int d = c+1; d <= Math.cbrt(x-(a * a * a)); d++) {
                        double num4 = d * d * d;
                        if (num1 + num2 == num3 + num4) {
                            int t = (int) Math.round(num1+num2);

                            int l = (int) Math.round(Math.cbrt(num1));
                            int o = (int) Math.round(Math.cbrt(num2));
                            int p = (int) Math.round(Math.cbrt(num3));
                            int u = (int) Math.round(Math.cbrt(num4));
                            
                            String v = "^3";
                            String z = " + ";

                            StdOut.println(t+" = "+l+v+z+o+v+" = "+p+v+z+u+v);
                        }
                    }
                }
            }
        }
    }
}
