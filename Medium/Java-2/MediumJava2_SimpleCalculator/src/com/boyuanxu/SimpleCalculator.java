package com.boyuanxu;

import java.util.Scanner;

public class SimpleCalculator {

    Scanner s = new Scanner(System.in);

    public void printWelcomeMessage() {
        String welcomeMessage = "Welcome to my Java calculator!";
        System.out.println(welcomeMessage);
    }

    public double calculate(int arithmeticChoice, double number1, double number2) {
        double result = 0;
        if (arithmeticChoice == 1) {
            result = number1 + number2;
        } else if (arithmeticChoice == 2) {
            result = number1 - number2;
        } else if (arithmeticChoice == 3) {
            result = number1 * number2;
        } else if (arithmeticChoice == 4) {
            result = number1 / number2;
        } else {
            System.out.println("Invalid arithmetic choice! Aborting…");
            System.exit(7);
        }
        return result;
    }

    public int askUserForArithmeticChoice() {
        try {
            System.out.println("What arithmetic operation would you like to perform?");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            String userInput = s.nextLine();
            int arithmeticChoice = Integer.parseInt(userInput);
            if (arithmeticChoice >= 1 && arithmeticChoice <= 4) {
                return arithmeticChoice;
            } else {
                System.out.println("Invalid choice!");
                return askUserForArithmeticChoice();
            }
        } catch (NumberFormatException e) {
            System.out.println("Please input a number!");
            return askUserForArithmeticChoice();
        }
    }

    public double askForFirstNumber() {
        try {
            System.out.print("Please enter the first number: ");
            String userInput = s.nextLine();
            return Double.parseDouble(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Please input a number!");
            return askForFirstNumber();
        }
    }

    public double askForSecondNumber() {
        try {
            System.out.print("Please enter the second number: ");
            String userInput = s.nextLine();
            return Double.parseDouble(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Please input a number!");
            return askForSecondNumber();
        }
    }

    public void runCalculator() {
        printWelcomeMessage();
        String userInput;
        double number1 = askForFirstNumber();
        System.out.println();
        int arithmeticChoice = askUserForArithmeticChoice();
        double number2 = askForSecondNumber();
        System.out.println();
        double result = calculate(arithmeticChoice, number1, number2); // We declare a new variable to store the result. It must be a double because we want to keep the precision and try not to truncate.
        System.out.println("The result of your calculation is " + result); // You can put strings and numbers together for output using ‘+’.
    }
}
