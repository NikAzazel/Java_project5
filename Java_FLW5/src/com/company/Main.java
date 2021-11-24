package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static String roundpt1 (float val)
    { return String.format("%.1f", val); }
    public static String roundpt0 (float val)
    { return String.format("%.0f", val); }
    public static void main(String[] args) {
	// write your code here
        //////////////////////////1//////////////////////////
        out.println("///1///");
        String s = "ABC";
        switch(s) {
            case "as":
                System.out.println("Yes");
            default:
                System.out.println("No");
        }
        //////////////////////////3//////////////////////////
        out.println("///3///");
        Scanner scan = new Scanner(in);
        String Hi = "Hi";
        String input = scan.nextLine();
        String res = input.equals(Hi)? ("Mutually \"Good day\"") : ("(-_-)/you serious?");
        out.println(res);
        //////////////////////////2//////////////////////////
        out.println("///2///");
        char c = scan.next().charAt(0);
        switch (c) {
            case 'A':
                out.println(roundpt0((float) (Math.random() * (10 - 1))));
                break;
            case 'B':
                out.println(roundpt1((float) (Math.random() * (100.0 - 10.0))));
                break;
            default:
                out.println("Enter A if you want to get a number between 1 and 10.");
                out.println("Or enter B if you want num between 10.0 and 100.0");
                break;
        }
    }
}
