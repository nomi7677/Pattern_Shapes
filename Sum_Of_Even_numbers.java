package com.firstpackage;

public class Sum_Of_Even_numbers {
    public static void main(String[] args) {

        // Sum of n Even numbers

        int sum = 0;
        int n = 5;

        for (int i = 0; i < n; i++) {
            sum = sum + (2 * i);
        }
            System.out.println(sum);
            // prints 20 which is sum of 1st 5 even numbers (0,2,4,6,8)
        }
    }
