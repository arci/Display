package it.display;

public class DigitPrinter {

    private static char digit[][][] = {
	    { { ' ', '_', ' ' }, { '|', ' ', '|' }, { '|', '_', '|' } }, // 0
	    { { ' ', ' ', ' ' }, { ' ', ' ', '|' }, { ' ', ' ', '|' } }, // 1
	    { { ' ', '_', ' ' }, { ' ', '_', '|' }, { '|', '_', ' ' } }, // 2
	    { { ' ', '_', ' ' }, { ' ', '_', '|' }, { ' ', '_', '|' } }, // 3
	    { { ' ', ' ', ' ' }, { '|', '_', '|' }, { ' ', ' ', '|' } }, // 4
	    { { ' ', '_', ' ' }, { '|', '_', ' ' }, { ' ', '_', '|' } }, // 5
	    { { ' ', '_', ' ' }, { '|', '_', ' ' }, { '|', '_', '|' } }, // 6
	    { { ' ', '_', ' ' }, { ' ', ' ', '|' }, { ' ', ' ', '|' } }, // 7
	    { { ' ', '_', ' ' }, { '|', '_', '|' }, { '|', '_', '|' } }, // 8
	    { { ' ', '_', ' ' }, { '|', '_', '|' }, { ' ', '_', '|' } } // 9
    };

    private static char comma[][] = { { ' ', ' ', '.' } };

    public static void print(String number) {
	number = number.replace(',', '.');
	System.out.println(number);
	if (isDouble(number)) {
	    doubleToDigit(number);
	} else {
	    intToDigit(number);
	}
    }

    private static boolean isDouble(String number) {
	return Double.parseDouble(number)
		- Math.rint(Double.parseDouble(number)) != 0;
    }

    private static void doubleToDigit(String number) {
	for (int line = 1; line <= 3; line++) {
	    for (int i = 0; i < number.length(); i++) {
		if (number.charAt(i) != '.') {
		    printLine(Character.getNumericValue(number.charAt(i)), line);
		} else {
		    System.out.print(comma[0][line - 1]);
		}
	    }
	    System.out.println();
	}
    }

    public static void intToDigit(String number) {
	for (int line = 1; line <= 3; line++) {
	    for (int i = 0; i < number.length(); i++) {
		printLine(Character.getNumericValue(number.charAt(i)), line);
	    }
	    System.out.println();
	}
    }

    private static void printLine(int number, int line) {
	for (int j = 0; j < 3; j++) {
	    System.out.print(digit[number][line - 1][j]);
	}
	System.out.print(" ");
    }

}