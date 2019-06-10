package com.blaqueyard.tasks;

public class problemFour {
    //main function calling the solution methods
    public static void main(String[] args) {

        //create instance of the object
        problemFour ps = new problemFour();

        //call the individual methods
        int a = ps.Solution();

        //print solution
        System.out.println(a);
    }

    private int Solution(){
        //Note that the maximum product is 999 * 999.
        int maxPalin = -1;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int prod = i * j;
                System.out.println(prod);
                if (isPalindrome(prod) && prod > maxPalin)
                    maxPalin = prod;
            }
        }
        return maxPalin;
    }

    // Tests whether the given integer is a palindrome
    private static boolean isPalindrome(final int product) {
        int p = product;
        int reverse = 0;
        while (p != 0) {
            reverse *= 10;
            reverse += p % 10;
            p /= 10;
        }
        return reverse == product;
    }
}
