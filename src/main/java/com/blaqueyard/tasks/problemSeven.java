package com.blaqueyard.tasks;

import java.math.BigInteger;

public class problemSeven {
    //main function calling the solution methods
    public static void main(String[] args) {

        //create instance of the object
        problemSeven ps = new problemSeven();

        //call the individual methods
        int b = ps.Solution();

        //print solution
        System.out.println(b);
    }

    private int Solution(){
        for (int i = 2, count = 0; ; i++) {
            //check if prime is true
            if (isPrime(i)) {
                count++;
                if (count == 10001)
                    return i;
            }
        }
    }

    //checks whether an int is prime or not.
    private boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

}
