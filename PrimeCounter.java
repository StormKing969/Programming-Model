// PrimeCounter.java: takes an integer N as a command-line argument and writes
// the number of primes <= N.

import edu.princeton.cs.algs4.StdOut;

public class PrimeCounter {
    // Returns true if x is prime, and false otherwise.
    private static boolean isPrime(int x) {
        if (x < 2) {
            return  false;
        }
        else {
            for (int i = 2; i  <= x / i; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // Returns the number of primes <= N.
    private static int primes(int N) {
        int count = 0;
        for (int i = 0; i <= N; i++) {
            if (PrimeCounter.isPrime(i)) {
                count = count+1;
            }
        }
        return count;
    }

    // Entry point. [DO NOT EDIT]
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        StdOut.println(primes(N));
    }
}
