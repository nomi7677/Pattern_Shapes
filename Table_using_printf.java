package com.firstpackage;

public class Table_using_printf {
    public static void main(String[] args) {

        // print table of 5 from 1 to 10 values

        int n=5;
        for (int i=1; i <=10; i++){
            System.out.printf("%d X %d\n", n,i, n*i);
        }
    }
}
