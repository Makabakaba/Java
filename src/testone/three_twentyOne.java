package testone;
import java.util.Scanner;
public class three_twentyOne {
	
	public static void main(String[] args) {
		System.out.println("Enter year: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.println("Enter month: ");
		int month = input.nextInt();
		System.out.println("Enter the day of the month: ");
		int day = input.nextInt();
		int week;
		week = (day + (26*(month+1))/10 + year%100 + year%100/4 + year/100 + 5*(year/100)) % 7;
		if(week == 0) System.out.println("Saturday");
		else if(week == 1) System.out.println("Sunday");
		else if(week == 2) System.out.println("Monday");
		else if(week == 3) System.out.println("Tuesday");
		else if(week == 4) System.out.println("Wednesday");
		else if(week == 5) System.out.println("Thursday");
		else System.out.println("Friday");
	}
}
