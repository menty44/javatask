package com.blaqueyard.tasks;

public class problemNine {
    //main function calling the solution methods
    public static void main(String[] args) {

        //create instance of the object
        problemNine ps = new problemNine();

        //call the individual methods
        long a = ps.Solution();

        //print solution
        System.out.println(a);
    }


    /**
     * @return Solution
     */
    private long Solution(){
        int LIMIT = 2000000;
        // new BigInteger("2");
        long sum = 2;
        for (int i=3; i<LIMIT; i++) {
            if(isPrime(i)) {
                //.add(BigInteger.valueOf(i));
                sum = sum + i;
            }
        }
        return sum;
    }

    /**
     * checks whether an int is prime or not.
     * @param n
     * @return true
     */
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
