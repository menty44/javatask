package com.blaqueyard.tasks;

import java.util.Arrays;

public class problemEight {
    //main function calling the solution methods
    public static void main(String[] args) {

        //create instance of the object
        problemEight ps = new problemEight();

        //call the individual methods
        int b = ps.Solution();

        //print solution
        System.out.println(b);
    }

    /**
     * @return Solution
     */
    private int Solution(){
        for (int i = 1; ; i++) {
            if (i > Integer.MAX_VALUE / 6)
                throw new ArithmeticException("Max Value");
            if (multiplesHaveSameDigits(i))
                return i;
        }
    }

    /**
     * boolean method for checking if values are equal
     * @param x
     * @return
     */
    private static boolean multiplesHaveSameDigits(int x) {
        for (int i = 2; i <= 6; i++) {
            if (!Arrays.equals(Sort(x), Sort(i * x)))
                return false;
        }
        return true;
    }

    /**
     * method for sorting
     * @param x
     * @return
     */
    private static char[] Sort(int x) {
        char[] rs = Integer.toString(x).toCharArray();
        Arrays.sort(rs);
        return rs;
    }

}
