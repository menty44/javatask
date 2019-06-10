package com.blaqueyard.tasks;

import java.math.BigInteger;

public class problemFive {
    //main function calling the solution methods
    public static void main(String[] args) {

        //create instance of the object
        problemFive ps = new problemFive();

        //call the individual methods
        BigInteger a = ps.Sample();
        BigInteger b = ps.Solution();

        //print sample
        System.out.println(a);
        //print solution
        System.out.println(b);
    }

    public BigInteger Sample(){
        BigInteger samLcm = BigInteger.ONE;
        for (int i = 1; i <= 10; i++)
            samLcm = lcm(BigInteger.valueOf(i), samLcm);
        return samLcm;
    }

    private BigInteger Solution(){
        BigInteger allLcm = BigInteger.ONE;
        for (int i = 1; i <= 20; i++)
            //find the lcm
            allLcm = lcm(BigInteger.valueOf(i), allLcm);
        return allLcm;
    }

    //method for calculating lcm
    private static BigInteger lcm(BigInteger x, BigInteger y) {
        return x.divide(x.gcd(y)).multiply(y);
    }
}
