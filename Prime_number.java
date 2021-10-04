package com.firstpackage;
import java.util.Scanner;
public class Prime_number {
    public static void main(String[] args) {

        //******* to check prime number **************
        int temp = 0;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        scan.close();

        for (int i = 2; i < num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");

        }
    }
}
