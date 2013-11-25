package it.display;

import java.util.Scanner;

public class Display {

    public static void main(String[] args) {
	while (true) {
	    ask();
	}
    }

    public static void ask() {
	Scanner in = new Scanner(System.in);
	System.out.print("Insert a number: ");
	DigitPrinter.print(in.nextLine());
	System.out.println();
    }
}