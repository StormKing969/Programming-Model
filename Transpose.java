// Transpose.java: reads a square matrix of doubles from standard input, and
// the computes and writes its transpose.

import edu.princeton.cs.algs4.StdArrayIO;

public class Transpose {
    // Transposes the square matrix x in place.
    private static void transpose(double[][] x) {
        int row = x.length;
        int col = x[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = i+1; j < col; j++) {
               double val = x[i][j];
               x[i][j] = x[j][i];
               x[j][i] = val;
            }
        }
    }

    // Entry point. [DO NOT EDIT]
    public static void main(String[] args) {
        double[][] x = StdArrayIO.readDouble2D();
        transpose(x);
        StdArrayIO.print(x);
    }
}
