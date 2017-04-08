// ThreeDice.java: Writes the sum of three random integers between 1 and 6, such
// as you might get when rolling three dice.

import edu.princeton.cs.algs4.StdOut;

public class ThreeDice {
    public static void main(String[] args) {
        int roll1 = (int) (Math.random()*6)+1;
        int roll2 = (int) (Math.random()*6)+1;
        int roll3 = (int) (Math.random()*6)+1;
        
        int sum = roll1 + roll2 + roll3;
        
        StdOut.println(sum);

    }
}
