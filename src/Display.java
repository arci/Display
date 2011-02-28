import java.util.*;
import java.lang.*;
import java.math.*;

public class Display {

	static char digit[][][] = {
				{{' ','_',' '},{'|',' ','|'},{'|','_','|'}}, //0
				{{' ',' ',' '},{' ',' ','|'},{' ',' ','|'}}, //1
				{{' ','_',' '},{' ','_','|'},{'|','_',' '}}, //2
				{{' ','_',' '},{' ','_','|'},{' ','_','|'}}, //3
				{{' ',' ',' '},{'|','_','|'},{' ',' ','|'}}, //4
				{{' ','_',' '},{'|','_',' '},{' ','_','|'}}, //5
				{{' ','_',' '},{'|','_',' '},{'|','_','|'}}, //6
				{{' ','_',' '},{' ',' ','|'},{' ',' ','|'}}, //7
				{{' ','_',' '},{'|','_','|'},{'|','_','|'}}, //8
				{{' ','_',' '},{'|','_','|'},{' ','_','|'}}  //9		
				};
	/*TODO
	static char signes[][][] = {
				{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}}, //0
				{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}}, //1
				{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}}, //2
				{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}}  //3
				};
	*/
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
                
		System.out.printf("Inserisci un numero: ");
		String number = in.nextLine();
		
		numberToDigit(number);
		System.out.printf("to vertical \n");
		toDigitVertical();
		System.out.printf("to horizontal \n");
		toDigitHorizontal();
	    

	}
	
	
	public static int stringToInt(String number){
		int n = 0;
		for(int j=0, i=number.length()-1; i>=0; j++, i--)
			n += Character.getNumericValue( number.charAt(i)) * Math.pow( 10,j);
		return n;
	}
	
	/*
	 * print the number passed like 7-segment display 
	 * @param: the number to convert
	 */
	public static void numberToDigit(String number){
		
		for(int i=0; i<number.length(); i++)
			numberToDigitFirstLine( Character.getNumericValue( number.charAt(i)));
		System.out.printf("\n");
		
		for(int i=0; i<number.length(); i++)
			numberToDigitSecondLine( Character.getNumericValue( number.charAt(i)));
		System.out.printf("\n");
		
		for(int i=0; i<number.length(); i++)
			numberToDigitThirdLine( Character.getNumericValue( number.charAt(i)));
		System.out.printf("\n");

	}
	
	private static void numberToDigitFirstLine(int number){
		
		int i=0;
		for(int j=0; j<3; j++){
			System.out.printf("%c",digit[number][i][j]);					
			}
		System.out.printf(" ");
	}
	
	private static void numberToDigitSecondLine(int number){
		
		int i=1;
		for(int j=0; j<3; j++){
			System.out.printf("%c",digit[number][i][j]);					
			}
		System.out.printf(" ");
	}
	
	private static void numberToDigitThirdLine(int number){
		
		int i=2;
		for(int j=0; j<3; j++){
			System.out.printf("%c",digit[number][i][j]);					
			}
		System.out.printf(" ");
	}
	
	/*
	 *Print digit from 0 to 9 in horizontal
	 */
	public static void toDigitHorizontal(){
		
		for(int i=0; i<3; i++){
			for(int j=0; j<10; j++){
				for(int w=0; w<3; w++){
					System.out.print( digit[j][i][w] );					
				}
				System.out.print(" ");
			}
			System.out.println();
		}
			
	}
	
	/*
	 *Print digit from 0 to 9 in vertical
	 */
	public static void toDigitVertical(){
	
		for(int i=0; i<10; i++){
			for(int j=0; j<3; j++){
				for(int w=0; w<3; w++){
					System.out.print( digit[i][j][w]);
				}
				System.out.println();
			}
		System.out.println();
			
		}
	}
}

	