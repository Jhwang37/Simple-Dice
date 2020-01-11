package com.company;

import java.util.Random;
import java.util.Scanner;
/*
 *Author: Jhwang37
 * Project: Simple Dice
 * 1/11/2020
 */

public class Dice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int maxRoll = 0;
        int dice = 0;
        int startGame = 0;

        System.out.println("=============================");
        System.out.println("------------Dice-------------");
        System.out.println("=============================\n\n");
        System.out.println("Enter the max number you would like your dice to have: ");
        maxRoll = scan.nextInt();
        System.out.println("=====================================================");
        System.out.println("You have chosen a dice that includes the numbers 1 - " + maxRoll);
        System.out.println("=====================================================\n");

        while (true) {
            System.out.println("Enter 1 to roll the dice/Enter 2 to end\n");
            startGame = scan.nextInt();
            if (startGame == 1) {
                dice = r.nextInt(maxRoll) + 1;
                System.out.println("\nYou rolled " + dice);
            } else if (startGame == 2) {
                System.out.println("Thank you for using the Dice Application");
            }
        }
    }
}
