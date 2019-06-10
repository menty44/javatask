package com.blaqueyard.tasks;

public class problemSix {

    //main function calling the solution methods
    public static void main(String[] args) {

        //create instance of the object
        problemSix ps = new problemSix();

        //call the individual methods
        int a = ps.Sample();
        int b = ps.Solution();

        //output sample
        System.out.println(a);
        //output actual solution
        System.out.println(b);
    }

    /*
        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
     */
    public int Sample(){
        int limit = 10;
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
            sum2 += i * i;
        }
        return sum * sum - sum2;
    }

    /*
       Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum
     */
    public int Solution(){
        int limit = 100;
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i;
            sum2 += i * i;
        }
        return (sum * sum - sum2);
    }
}


