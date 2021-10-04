package com.firstpackage;

public class Factorial {
    public static void main(String[] args) {
        // factorial 5! = 5x4x3x2x1 = 120
        int n = 5;
        int i = 1;
        int factorial = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }
//        for (int i=1;i<=n; i++){
//            factorial *=i;
//        }
            //if i don't use bracket before sout then it will print product each time it multiplies
//        }
            System.out.println(factorial);


    }
}
