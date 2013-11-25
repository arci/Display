package it.ArciDeky.Display;
public class DigitBuilder {

    static char digit[][][] = {
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

    static char comma[][] = { { ' ', ' ', '.' } };


    public boolean isDouble(String number) {

	return Double.parseDouble(number)
		- Math.rint(Double.parseDouble(number)) != 0;
    }

    public void doubleToDigit(String number) {

	for (int i = 0; i < number.length(); i++) {
	    if (number.charAt(i) != '.') {
		numberToDigitFirstLine(Character.getNumericValue(number
			.charAt(i)));
	    } else {
		System.out.printf("%c", comma[0][0]);
	    }
	}
	System.out.printf("\n");

	for (int i = 0; i < number.length(); i++) {
	    if (number.charAt(i) != '.') {
		numberToDigitSecondLine(Character.getNumericValue(number
			.charAt(i)));
	    } else {
		System.out.printf("%c", comma[0][1]);
	    }
	}
	System.out.printf("\n");

	for (int i = 0; i < number.length(); i++) {
	    if (number.charAt(i) != '.') {
		numberToDigitThirdLine(Character.getNumericValue(number
			.charAt(i)));
	    } else {
		System.out.printf("%c", comma[0][2]);
	    }
	}
	System.out.printf("\n");
    }

    public void intToDigit(String number) {

	for (int i = 0; i < number.length(); i++) {
	    numberToDigitFirstLine(Character.getNumericValue(number.charAt(i)));
	}
	System.out.printf("\n");

	for (int i = 0; i < number.length(); i++) {
	    numberToDigitSecondLine(Character.getNumericValue(number.charAt(i)));
	}
	System.out.printf("\n");

	for (int i = 0; i < number.length(); i++) {
	    numberToDigitThirdLine(Character.getNumericValue(number.charAt(i)));
	}
	System.out.printf("\n");

    }

    private void numberToDigitFirstLine(int number) {

	for (int j = 0; j < 3; j++) {
	    System.out.printf("%c", digit[number][0][j]);
	}
	System.out.printf(" ");
    }

    private void numberToDigitSecondLine(int number) {

	for (int j = 0; j < 3; j++) {
	    System.out.printf("%c", digit[number][1][j]);
	}
	System.out.printf(" ");
    }

    private void numberToDigitThirdLine(int number) {

	for (int j = 0; j < 3; j++) {
	    System.out.printf("%c", digit[number][2][j]);
	}
	System.out.printf(" ");
    }

}