package com.firstpackage;

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissors_game {
    public static void main(String[] args) {
        // Rock=0, Paper=1, Scissor=2

        Scanner sc = new Scanner(System.in);
        System.out.println("Dear User, Enter your choice: 0 for Rock, 1 for paper and 2 for Scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput){
            System.out.println("Game is a draw");
        } else if (userInput ==0 && computerInput ==2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1){
            System.out.println("User won the game");
        } else{
            System.out.println("Computer won the game");
        }
        if(computerInput == 0){
            System.out.println("Computer choice was: Rock");
        }else if (computerInput == 1){
            System.out.println("Computer choice was: Paper");
        }else if(computerInput == 2){
            System.out.println("Computer choice was: Scissor");
        }
    }
}
