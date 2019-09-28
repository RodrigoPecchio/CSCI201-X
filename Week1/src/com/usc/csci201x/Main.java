/*
    Creating a command line Java program,
    Reading arguments,
    Reading user input,
    Conditions,
    Loops,
    Methods,
    Arrays,
    Strings,
    Classes,
    Packages,
    Exception handling
*/

package com.usc.csci201x;

public class Main {

    public static void main(String[] args) {
        ArgumentParser a = new ArgumentParser();
        a.parse(args);
        InputProcessor i = new InputProcessor();
        i.run();
    }
}
