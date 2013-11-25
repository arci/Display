package it.ArciDeky.Display;

import java.util.Scanner;

public class Display {

    public static void main(String[] args) {
	while (true) {
	    ask();
	}
    }

    public static void ask() {
	Scanner in = new Scanner(System.in);
	System.out.print("Inserisci un numero: ");
	String number = in.nextLine();

	DigitBuilder display = new DigitBuilder();
	if (display.isDouble(number)) {
	    display.doubleToDigit(number);
	} else {
	    display.intToDigit(number);
	}
	System.out.println();
    }
}