package com.firstpackage;

public class Reverse_hill_pattern {
    public static void main(String[] args) {

//************ REVERSE HILL PATTERN ********** (inc, dec, dec)

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for (int j=i; j<n; j++){
                System.out.print("* ");
            }
            for (int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
