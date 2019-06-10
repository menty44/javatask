package com.blaqueyard.tasks;

public class problemThree {
    //main function calling the solution methods
    public static void main(String[] args) {

        //create instance of the object
        problemThree ps = new problemThree();

        //call the individual methods
        int a = ps.Sample();
        int b = ps.Solution();

        //The prime factors of 13195 are 5, 7, 13 and 29.
        System.out.println(a);

        System.out.println("##################################");
        //output actual solution; What is the largest prime factor of the number 600851475143 ?
        System.out.println(b);
    }

    public int Sample(){
        long testNum = 13195;
        int largestFact = 0;
        //largest known prime
        long loopMaxno = 17425170l;

        for (int i = 3; i * i <= loopMaxno; i++) {
            boolean isPrimeno = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeno = false;
                    break;
                }
            }
            if (isPrimeno && testNum % i == 0) {
                //displaying the prime factors
                System.out.println("prime factor test: " + i);
                largestFact = i;
                loopMaxno = (testNum / i) + 1;
            }
        }
        return largestFact;
    }

    public int Solution(){
        long testNum = 600851475143l;
        int largestFactor = 0;
        //largest known prime
        long loopMax = 17425170l;
        for (int i = 3; i * i <= loopMax; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && testNum % i == 0) {
                //displaying the prime factors
                System.out.println("prime factor : " + i);
                largestFactor = i;
                loopMax = (testNum / i) + 1;
            }
        }
        return largestFactor;
    }
}
