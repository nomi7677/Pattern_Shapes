package com.firstpackage;

import java.util.Scanner;

public class Income_tax {
    public static void main(String[] args) {
        // for income 250000 - 500000 tax is 5%
        // 500001 - 750000 is 10%
        // 750001 - 1000000 is 20%


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income");
        float tax=0;
        float income = sc.nextFloat();

        if (income<=250000f){
            tax = tax+ 0;
        }else if (income>250000f && income <=500000f){
            tax = tax + 0.05f * (income-250000f);
        }else if (income>500000f && income<=750000f){
            tax = tax + 0.05f * (500000f - 250000f);
            tax = tax + 0.10f * (income-500000f);
        }else if (income>750000f && income <=1000000f){
            tax = tax + 0.05f *(500000f - 250000f);
                    tax = tax + 0.10f * (750000f - 500000f);
                            tax = tax + 0.20f * (income- 750000f);

        }

        System.out.println("tax paid on the income is" +" " + tax/100);


    }
}
