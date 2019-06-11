package com.blaqueyard.tasks;

public class test {
    public static void main(String[]args){
        int n = 2000000;
        boolean[] isPrime = new boolean[n];
        //preprocess - set up the array
        for (int i = 2; i<n;i++) isPrime[i] = true;
        //run sieve:
        for (int i = 2; i < (int) Math.sqrt(n) + 1; i++) {
            if (isPrime[i]) {
                for (int j = 2; j*i < n; j++) isPrime[i*j] = false;
            }
        }
        //sum primes:
        long sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) sum+=i;
        }
        System.out.println(sum);
    }
    //142 913 828 922
}
