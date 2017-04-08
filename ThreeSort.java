// ThreeSort.java: Takes three integers as command-line arguments and writes
// them in ascending order, separated by spaces.

import edu.princeton.cs.algs4.StdOut;

public class ThreeSort {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int x2 = Integer.parseInt(args[1]);
        int x3 = Integer.parseInt(args[2]);

        int first = Math.min(x1, Math.min(x2, x3)); 
        int last = Math.max(x1, Math.max(x2, x3));
        int middle = x1+x2+x3-first-last;

        StdOut.println(first + " " + middle + " " + last);

    }
}
