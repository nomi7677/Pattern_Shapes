package com.firstpackage;

public class Hill_pattern {
    public static void main(String[] args) {

// *********** HILL PATTERN ************// (Dec, Inc and Inc)
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j=i; j<=n; j++){
                System.out.print("  ");
            }
            for (int j=1; j<i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
      }
    }
    }
