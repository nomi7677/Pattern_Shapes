package com.firstpackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // The Kalebnacci sequence begins with 2 and -1 as its first and second terms.
        // After these first two elements, each subsequent element is equal to twice the previous previous term minus
        // the previous term.
        // kaleb(0) = 2
        // kaleb(1) = -1
        // kaleb(n) = 2*kaleb(n-2) - kaleb(n-1)
        // Find the nth number in the sequence
//
//        int n = 3;
//        int a = 2;
//        int b = -1;
//        int c;
//        System.out.print(a + " " + b + " ");
//        for (int i =0; i<n;i++){
//            c =2*a-b;
//            System.out.print(c + " " );
//            a=b;
//            b=c;
//        }


Scanner s1 = new Scanner(System.in);
        System.out.println("Enter sub 1 marks");
        float m1 = s1.nextInt();
        float mark1 = (m1/100);
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter sub 2 marks");
        float m2 = s2.nextInt();
        float mark2 = (m2/100);
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter sub 3 marks");
        float m3 = s3.nextInt();
        float mark3 = (m3/100);
        float sum = mark1+mark2+mark3;
        float aver = (sum)/3;

        System.out.println("Percentage is : " + aver * 100+"%");

    }
}


