package com.blaqueyard.tasks;

public class problemOne {

    //main function calling the solution methods
    public static void main(String[] args) {

        //create instance of the object
        problemOne problemOne = new problemOne();
        //call the individual methods
        int a = problemOne.Sample();
        int b = problemOne.Solution();

        //output sample solution
        System.out.println(a);
        //output actual solution
        System.out.println(b);
    }

    /*
        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
        The sum of these multiples is 23.
     */
    public int Sample(){
        int sum = 0;
        int max_limit = 10;
        for (int i = 0; i < max_limit; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return sum;
    }

    /*
        Find the sum of all the multiples of 3 or 5 below 1000.
     */
    public int Solution(){
        int sum = 0;
        int max_limit = 1000;
        for (int i = 0; i < max_limit; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return sum;
    }
}


