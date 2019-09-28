package com.usc.csci201x;

import java.util.Scanner;

public class InputProcessor {

    public void run() {
        Scanner s = new Scanner(System.in);

        s.close();

//        System.out.println("What is love?");
//        String whatIsLove = s.nextLine();
//
//        switch(whatIsLove) {
//            case "Baby don't hurt me.":
//                System.out.println("It is me, the Head CP.");
//                break;
//            case "Love is in the making.":
//                System.out.println(":inpink:");
//                break;
//            default:
//                System.out.println("Love is in the mirror.");
//                break;
//        }

        // Bad approach: The approach in the course slides.
//        System.out.print("Enter an integer: ");
//        int i1 = s.nextInt();
//        System.out.println("The int input is: " + i1);
//        System.out.println("Enter a string: ");
//        String s1 = s.nextLine();
//        System.out.println("The string input is: " + s1);

        // Good approach: The Head CP approach.

        int i1 = 0;
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                i1 = Integer.parseInt(s.nextLine());
                break;
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                System.out.println("E_BADINT: Please enter an integer!");
            }
        }



        System.out.println("The int input is: " + i1);
        System.out.println("Enter a string: ");
        String s1 = s.nextLine();
        System.out.println("The string input is: " + s1);
    }

}
