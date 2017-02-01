package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean option = true;
        while (option) {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter your number");
            int userInput = scnr.nextInt();

            System.out.format("%-15s%-15s%-15s", "Number", "Squared", "Cubed");
            System.out.println();
            System.out.format("%-15s%-15s%-15s", "======", "=======", "=====");
            System.out.println();
            for (int i = 1; i <= userInput; i++) {

                System.out.format("%-15s%-15s%-15s", i, i * i, i * i * i);
                System.out.println();


            }
            System.out.println("Would you like to continue? y/n");
            String answer = scnr.next();
            if (answer.charAt(0) == 'n') {
                option = false;
            }
        }
    }


}
