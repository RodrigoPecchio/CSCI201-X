package com.usc.csci201x;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputProcessor {

    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("What is love?");
        String whatIsLove = s.nextLine();

        switch(whatIsLove) {
            case "Baby don't hurt me.":
                System.out.println("It is me, the Head CP™.");
                break;
            case "Love is in the making.":
                System.out.println(":inpink:");
                break;
            default:
                System.out.println("Love is in the mirror.");
                break;
        }

        while (true) {
            System.out.println("Do you want the good approach or bad approach? (Type 'G' or 'B')");
            String approach = s.nextLine();
            if (approach.equalsIgnoreCase("G")) {
                // Good approach: The Head CP™ approach.
                int i2 = 0;
                while (true) {
                    System.out.println("Enter an integer: ");
                    try {
                        i2 = Integer.parseInt(s.nextLine());
                        break;
                    } catch (InputMismatchException | NumberFormatException e) {
//                     e.printStackTrace();    // Good for debugging
                        System.out.println("Please enter an int!");
                    }
                }
                System.out.println(i2);
                System.out.print("Now, enter a string: ");
                String s2 = s.nextLine();
                System.out.println("The string input is: " + s2);
                break;
            } else if (approach.equalsIgnoreCase("B")) {
                // Bad approach: The approach in the course slides.
                System.out.print("Enter an integer: ");
                int i1 = s.nextInt();
                System.out.println("The int input is: " + i1);
                System.out.print("Enter a string: ");
                String s1 = s.nextLine();
                System.out.println(s1);
                System.out.println("The string input is: " + s1);
                break;
            } else {
                System.out.println("Do you not know how to answer a simple question?");
            }
        }
    }

}
