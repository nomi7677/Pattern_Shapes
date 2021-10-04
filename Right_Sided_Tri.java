package com.firstpackage;

public class Right_Sided_Tri {
    public static void main(String[] args) {
        // ************ RIGHT SIDED TRIANGLE WITH DEC AND INC PATTERN ***************
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
