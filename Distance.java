// Distance.java: reads two position vectors from standard input, and then
// computes and writes the Euclidean distance between the two.

import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;

public class Distance {
    // Returns the Euclidean distance between the position vectors x and y.
    private static double distance(double[] x, double[] y) {
       double total = 0.0;
       int size = x.length;
       for (int i = 0; i < size; i++) {
           total = total + ((x[i]-y[i]) * (x[i]-y[i]));
        }
        return Math.sqrt(total);
    }

    // Entry point. [DO NOT EDIT]
    public static void main(String[] args) {
        double[] x = StdArrayIO.readDouble1D();
        double[] y = StdArrayIO.readDouble1D();
        StdOut.println(distance(x, y));
    }
}
