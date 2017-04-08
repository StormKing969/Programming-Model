// Power.java: reads integers a and b from command line and writes the value
// of a to the power b, computed recursively.

import edu.princeton.cs.algs4.StdOut;

public class Power {
    // Returns a to the power b, computed recursively.
    private static int power(int a, int b) {
        int cal;
        if (b == 0) {
            cal = 1;
        }
        else if (b % 2 != 0) {
            cal = a * power(a, b- 1);
        }
        else {
            cal = power(a * a, b / 2);
        }
        return cal;
    }

    // Entry point. [DO NOT EDIT]
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        StdOut.println(power(a, b));
    }
}
