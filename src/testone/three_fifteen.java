package testone;
import java.util.Scanner;
public class three_fifteen {

	public static void main(String[] args) {
		int number = (int)(Math.random()*900)+100;
		Scanner input = new Scanner(System.in);
		System.out.println("take your number: ");
		int luck = input.nextInt();
		System.out.println(number);
		int[] a = new int[3];
		int[] b = new int[3];
		int save = 3;
		a[0] = number%10;
		a[1] = number/10%10;
		a[2] = number/100%10;
		b[0] = luck%10;
		b[1] = luck/10%10;
		b[2] = luck/100%10;
		if(a[0]==b[0] && a[1]==b[1] && a[1]==b[1]) System.out.println("get $10000");
		else {
			for(int i = 0; i < a.length; i++) {
				for(int j = 1; j < a.length; j++) {
					if(a[i] == b[j]) {
						save -= 1;
						continue;
					}
				}
			}
			if(save == 0) System.out.println("get $3000");
			else if(save == 2) System.out.println("get $1000");
			else System.out.println("none");
		}
	}

}