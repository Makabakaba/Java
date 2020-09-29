package testone;
import java.util.Scanner;
public class three_twentyFour {

	public static void main(String[] args) {
		int a = (int)(Math.random()*13)+1;
		int b = (int)(Math.random()*4)+1;
		System.out.print("The card you picked is ");
		if(a == 1) System.out.print("Ace of ");
		else if(a == 2) System.out.print("2 of ");
		else if(a == 3) System.out.print("3 of ");
		else if(a == 4) System.out.print("4 of ");
		else if(a == 5) System.out.print("5 of ");
		else if(a == 6) System.out.print("6 of ");
		else if(a == 7) System.out.print("7 of ");
		else if(a == 8) System.out.print("8 of ");
		else if(a == 9) System.out.print("9 of ");
		else if(a == 10) System.out.print("10 of ");
		else if(a == 11) System.out.print("Jack of ");
		else if(a == 12) System.out.print("Queen of ");
		else System.out.print("King of ");
		if(b == 1) System.out.print("Clubs");
		else if(b == 2) System.out.print("Diamonds");
		else if(b == 3) System.out.print("Hearts");
		else System.out.print("Spades");
	}

}
