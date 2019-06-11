package com.blaqueyard.tasks;

/**
 *
 */
public class problemTen {

    //main function calling the solution methods
    public static void main(String[] args) {

        //create instance of the object
        problemTen ps = new problemTen();

        //call the individual methods
        String a = ps.Sample();

        //output sample solution
        System.out.println(a);
    }

    /*
        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
        The sum of these multiples is 23.
     */
    private String Sample(){
        int Max = pow(10, 6);
        boolean[] isPrime = listPrimality(Max);
        int[] primes = listPrimes(Max);

        long maxSum = 0;
        int maxRun = -1;
        for (int i = 0; i < primes.length; i++) {  // For each index of a starting prime number
            int sum = 0;
            for (int j = i; j < primes.length; j++) {  // For each end index (inclusive)
                sum += primes[j];
                if (sum > Max)
                    break;
                else if (j - i > maxRun && sum > maxSum && isPrime[sum]) {
                    maxSum = sum;
                    maxRun = j - i;
                }
            }
        }
        return Long.toString(maxSum);
    }

    /**
     * Returns x to the power of y, throwing an exception if the result overflows an int.
     * @param x
     * @param y
     * @return z
     */
    public static int pow(int x, int y) {
        if (x < 0)
            throw new IllegalArgumentException("Negative base not supported");
        if (y < 0)
            throw new IllegalArgumentException("Negative exponent");
        int z = 1;
        for (int i = 0; i < y; i++) {
            if (Integer.MAX_VALUE / z < x)
                throw new ArithmeticException("Overflow");
            z *= x;
        }
        return z;
    }

    /**
     * Returns a Boolean array 'isPrime' where isPrime[i] indicates whether i is prime, for 0 <= i <= n.
     * For a large batch of queries, this is faster than calling isPrime() for each integer.
     * @param n
     * @return
     */
    public static boolean[] listPrimality(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Negative array size");
        boolean[] result = new boolean[n + 1];
        if (n >= 2)
            result[2] = true;
        for (int i = 3; i <= n; i += 2)
            result[i] = true;
        // Sieve of Eratosthenes
        for (int i = 3, end = sqrt(n); i <= end; i += 2) {
            if (result[i]) {
                // Note: i * i does not overflow
                for (int j = i * i, inc = i * 2; j <= n; j += inc)
                    result[j] = false;
            }
        }
        return result;
    }

    /**
     * Returns floor(sqrt(x)), for x >= 0.
     * @param x
     * @return
     */
    public static int sqrt(int x) {
        if (x < 0)
            throw new IllegalArgumentException("Square root of negative number");
        int y = 0;
        for (int i = 1 << 15; i != 0; i >>>= 1) {
            y |= i;
            if (y > 46340 || y * y > x)
                y ^= i;
        }
        return y;
    }

    // Returns all the prime numbers less than or equal to n, in ascending order.
    // For example: listPrimes(97) = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, ..., 83, 89, 97}.
    public static int[] listPrimes(int n) {
        boolean[] isPrime = listPrimality(n);
        int count = 0;
        for (boolean b : isPrime) {
            if (b)
                count++;
        }

        int[] result = new int[count];
        for (int i = 0, j = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }
}


