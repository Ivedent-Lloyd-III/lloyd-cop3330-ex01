package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 1
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        String name = readName();
        String outputString = generateoutputString(name);
        printoutput(outputString);

    }

    private static void printoutput(String outputString) {

        System.out.println(outputString);

    }

    private static String readName(){

        System.out.print("What is your name? ");
        String name = in.nextLine();

        return name;
    }

    private static String generateoutputString(String name){

        return "Hello, " +name+ ", nice to meet you!";

    }


}
