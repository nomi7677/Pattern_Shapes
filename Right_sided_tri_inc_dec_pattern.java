package com.firstpackage;

public class Right_sided_tri_inc_dec_pattern {
    public static void main(String[] args) {

// ************ RIGHT SIDED TRIANGLE WITH INC AND DEC PATTERN **********
int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
                }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
                }
                System.out.println();
                }
    }
    }
