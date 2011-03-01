import java.util.*;
import java.lang.*;
import java.math.*;

public class Calculator {


        
    public static void main(String[] args) {
        
        Display display = new Display();
        
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Inserisci un numero: ");
        String number = in.nextLine();
        
        if(display.isDouble(number))
             display.doubleToDigit(number);
        else
             display.intToDigit(number);
    }
    
}