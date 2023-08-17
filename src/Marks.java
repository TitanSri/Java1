/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
/**
 *
 * @author admin
 */
public class Marks {
    private static final int NMARKS = 125;
    private static final double mean = 65.0;
    private static final double std = 15.0;

    /**
     * Returns an array of NMARKS integer marks approximately normally distributed,
     * with specified mean (mean) and standard deviation (std),
     * and with values outside 0..100 removed.
     * @return the array of marks.
     */
    public static int[] getMarks() {
            Random rand = new Random(1001L);
            int mark;
            int[] theMarks = new int[NMARKS];
            int n = 0;
            while (n < NMARKS) {
                    mark = (int) Math.round(std*rand.nextGaussian() + mean);
                    if (mark >= 0 && mark <= 100)
                            theMarks[n++] = mark;
            }
            return theMarks;
    }
  
    /**
     * Test code
     * @param args not used
     */
    public static void main(String[] args) {
            int[] testMarks = getMarks();
            for (int n = 0; n < testMarks.length; n++) {
                    System.out.print(testMarks[n] + " ");
                    if (n % 10 == 9)
                            System.out.println();
            }
    }
}
