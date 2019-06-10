package com.blaqueyard.tasks;

public class problemTwo {

    //main function calling the solution methods
    public static void main(String[] args) {

        //create instance of the object
        problemTwo ps = new problemTwo();

        //call the individual methods
        int b = ps.Solution();

        //output actual solution
        System.out.println(b);
    }

    /*
        By considering the terms in the Fibonacci sequence whose values do not exceed four million,
        find the sum of the even-valued terms.
     */
    public int Solution(){
        int sum = 0;
        //current number processed
        int a = 1;
        // next number being processed
        int b = 2;

        do{
            //modulus to get even numbers
            if (a % 2 == 0)
                //increment by one as declared in the variable a
                sum += a;
            int k = a + b;
            a = b;
            b = k;

        }while (a <= 4000000);
        return sum;
    }
}


